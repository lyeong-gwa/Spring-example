# Spring-example
interceptor 정리

설정
MVC 프로젝트를 복사,
com.interceptor 패키지 생성후 confirminterceptor 파일 생성 -> 리퀘스트에 속성 city, code없으면 생성해주기
boardcontroller안에 리퀘스트 city,code없으면 생성해주는 코드 기입하기 (세션에 넣어줘야 됨)
인터셉트 자체에서 리퀘스트 파라미터를 변경하진 못한다.

servlet-context.xml에 다음을 추가한다.
	<beans:bean id="confirm" class="com.interceptor.ConfirmInterceptor"/>

	<interceptors>
		<interceptor>
		
			<!-- <mapping path="/mvc/*"/> 형태도 가능하다-->
			<mapping path="/"/>
			<!-- <exclude-mapping path="/user/log*"/> -->
			
			<!-- <beans:bean class="com.interceptor.ConfirmInterceptor"/> -->
			<beans:ref bean="confirm"/>
		</interceptor>
	</interceptors>