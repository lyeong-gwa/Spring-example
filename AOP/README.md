# Spring-example
AOP실습

기본설정
1. spring 프로젝트 생성 (Legacy - simple project)

2.maven설정 - pom.xml 에 다음을 추가
	<dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>5.3.23</version>
		</dependency>
	</dependencies>


<dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>3.0.7.RELEASE</version>
        </dependency>

		<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjrt -->
		<dependency>
			<groupId>org.aspectj</groupId>
			<artifactId>aspectjrt</artifactId>
			<version>1.7.3</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
		<dependency>
			<groupId>org.aspectj</groupId>
			<artifactId>aspectjweaver</artifactId>
			<version>1.6.7</version>
		</dependency>


3. Color.xml에 namespace에 aop체크하기

4. useAop패키지 코드 채워넣기

