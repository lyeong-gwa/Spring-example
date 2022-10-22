package useXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("useXml/Color.xml");
		
		Color red = context.getBean("red1",Color.class);
		Color blue = context.getBean("blue1",Color.class);
		Mix mix = context.getBean("mix1",Mix.class);
		red.print();
		blue.print();
		mix.print();
	}
}
