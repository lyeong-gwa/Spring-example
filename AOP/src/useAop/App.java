package useAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("useAop/Color.xml");
		
		Color red = context.getBean("red1",Color.class);
		Color blue = context.getBean("blue1",Color.class);
		
		red.setValue(1);
		blue.setValue(2);
		
		System.out.println(red.getValue());
		System.out.println(blue.getValue());
		
		//Mix mix = context.getBean("mix1",Mix.class);
		//mix.print();
	}
}
