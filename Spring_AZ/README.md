# Spring-example
어노테이션, xml활용법

기본 설정
1. maven설정 후 pom.xml에 다음 코드 기입
<dependency>
	<groupId>org.springframework</groupId>
	<artifactId>spring-context</artifactId>
	<version>5.3.23</version>
</dependency>

bean설정할 때 id앞글자는 소문자여야 한다. 대문자는 인식하지 않는다.
bean설정할 때 property를 사용하고자 한다면 set메소드가 필요하다.
bean설정할 때 constructor-arg를 사용하고자 한다면 생성자,그리고 파라미터들의 짝을 맞춰야 한다.
bean설정할 때 객체를 넣고자 할 때 ref로 이미 만들어진 bean을 활용하거나 태그 안에 bean을 넣어줘도 된다.

어노테이션을 활용하면 특정객체를 생성할 때 bean으로 등록할 필요없이 bean으로 등록된 객체를 주입받을 수 있다.
http://www.springframework.org/schema/context를 등록(namespace활용) -> context:component-scan
