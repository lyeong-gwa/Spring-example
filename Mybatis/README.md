# Spring-example
mybatis 사용정리

설정
1.MVC 프로젝트를 복사한다.
2.mvc.util 패키지는 사용하지 않으니 지운다.
3.MVC에서 dao개념은 mybatis에서는 mapper(인터페이스)가 대신 역할을 한다.
boardImpl클래스를 제거하고 DAO는 mapper로 변경한다. (패키지명도 mapper로 변경)

4. maven 설정 pom.xml에 다음 내용을 추가한다.
<dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.13</version>
        </dependency>


    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.5.6</version>
    </dependency>

    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis-spring</artifactId>
        <version>2.0.6</version>
    </dependency>

    <dependency>
        <groupId>commons-dbcp</groupId>
        <artifactId>commons-dbcp</artifactId>
        <version>1.4</version>
    </dependency>

    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>${org.springframework-version}</version>
    </dependency>

5. xeb.xml에는 utf를 위한 필터기능을 넣어준다. (mvc를 복사했으면 되어있다.)
<filter>
		<filter-name>encodingFilter</filter-name>
		<filter-class>
			org.springframework.web.filter.CharacterEncodingFilter
		</filter-class>
		<init-param>
			<param-name>encoding</param-name>
			<param-value>utf-8</param-value>
		</init-param>
	</filter>
	
	<filter-mapping>
		<filter-name>encodingFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>

6. webapp/WEB-INF/spring (root-context.xml과 동일한 레벨)에 데이터베이스 설정 파일을 넣어둔다.

7.root-context.xml에 component-scan에서 기존 dao에 해당하는 패키지를 제거해도 무방하다. 그리고 내용을 추가,
	<!-- mybatis: sqlSessionFactory -->
	<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="ds" />
		<property name="typeAliasesPackage" value="com.mvc.vo"/>
		<property name="mapperLocations" value="classpath:mapper/**/*.xml"/>
	</bean>
		
	
	<!-- java mapper(interface)를 찾아서 proxy객체를 생성한다 -->
	<bean id="config" class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="basePackage" value="com.mvc.model.mapper"/>
	</bean>
	
		<!-- transactionManager mybastis는 dataSource라는 트랙잭션 매니저를 쓴다.-->
	<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
		<property name="dataSource" ref="ds"/>
	</bean>
	<!-- @Transactional이 동작하도록  namespaces에서 tx선택 후-->
	<tx:annotation-driven transaction-manager="transactionManager"/>


8.resources에 mapper폴더를 생성후 Board.xml를 가져다 놓는다.
Board.xml은 sql문들이 있다.




autowire로 주입되는 아이는 proxy객체가 주입된다. (이전에는 DAOImpl이 이 역할을 대신했었다.)
이제 DAOImpl은 없으며 프록시가 자동으로 생성된다. -> 우리가 수정할 것은 mapper(이전 dao)로 xml과 자바형태의 mapper를 잘 맞춰야 연결할 때 문제가 없다.
