# Spring-example
MVC정리

설정
1. legacy - spring mvc project로 생성
2. pom.xml에 다음을 추가
<dependency>
	<groupId>javax.annotation</groupId>
	<artifactId>javax.annotation-api</artifactId>
	<version>1.3.2</version>
</dependency>

<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<version>8.0.13</version>
</dependency>

<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-webmvc</artifactId>
	<version>${org.springframework-version}</version>
</dependency>

3. springframework버전 5.2.6.RELEASE로변경하기 (pom.xml)
해당 버전 체크 안할 경우 GetMapping, PostMapping 어노테이션은 에러가 날것이다.

4. web.xml 설정 encodingfilter넣기 (선택사항)
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

5. root-context.xml 설정: web밖에도 다른 자바 기능에 영향을 주는 패키지 기입하기, 다음 코드를 추가
	<context:component-scan base-package="com.mvc.model.service" />
	<context:component-scan base-package="com.mvc.model.dao" />

6.servlet-context.xml 설정: 웹에서 사용하는 기능을 기입하는 파일 현재 예제에서는 controller를 인식할 수 있도록 설정
<context:component-scan base-package="com.mvc.controller" />을 추가하기

7.예제 코드에 맞게 mvc패턴으로 model 및 controller 추가

8. 데이터베이스 준비 (mysql)
db이름: board
num은 기본키, AI체크 int형
content는 varchar()
count는 int형
아이디 비번 등 설정하기 