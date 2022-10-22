package useContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ColorMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("useContext/Color.xml");
		
		Color red = (Color)context.getBean("red"); //context.getBean("red",Color.class)
		Color blue = (Color)context.getBean("blue");
		
		red.print();
		blue.print();
		
		Color tmp_blue = (Color)context.getBean("blue");
		System.out.println(blue==tmp_blue);
		
	}
}
