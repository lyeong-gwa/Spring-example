package useConfigClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		//xml파일을 사용하지 않고 동일한 기능을 하는 ConfigClass를 생성해서하는 방법
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Color red = context.getBean("red1",Color.class);
		Color blue = context.getBean("blue1",Color.class);
		Mix mix = context.getBean("mix1",Mix.class);
		red.print();
		blue.print();
		mix.print();
		
	}
}
