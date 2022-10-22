package useAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//Aspect 객체 (Advice(무엇을) + pointcut(언제))을 가지고 있음
//pointcut과 일치하는 때가 되면 advice가 weaving되어 들어가서 실행이 된다.
@Aspect
public class ColorTracker {

	@Before(value = "execution(void set*(*))") // 리턴타입 void set으로 시작하는 메소드 1개만 있는 파라미터의 메소드 실행 전에 호출
	public void colorTrackbefore(JoinPoint jp) { // Advice
		System.out.println("before시작");

		System.out.println("target:" + jp.getTarget().getClass().getName());
		System.out.println("method:" + jp.getSignature().getName());
		System.out.println("args:"+ jp.getArgs()[0]);
		
		System.out.println("before끝");
	}
	
//	//Around = before, after다하는 것
//	@Around(value = "execution(String get*())")  //리턴 오브젝트하는 것이 필요하다. 
//	public Object colorTrackafter(ProceedingJoinPoint jp) throws Throwable { // Advice
//		System.out.println("Around_before");
//
//		Object o = jp.proceed(); // 핵심메소드를 호출하는 것이다.
//		//System.out.println("Around_After" + o);
//		return o;
//	}
	
	
	
	@After(value = "execution(int get*())")
	public void colorTrackafter(JoinPoint jp) {
		System.out.println("After시작");

		System.out.println("target:" + jp.getTarget().getClass().getName());
		System.out.println("method:" + jp.getSignature().getName());
		
		System.out.println("After끝");
	}
	
}
