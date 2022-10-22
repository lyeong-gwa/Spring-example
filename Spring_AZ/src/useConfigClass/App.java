package useConfigClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		//xml������ ������� �ʰ� ������ ����� �ϴ� ConfigClass�� �����ؼ��ϴ� ���
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Color red = context.getBean("red1",Color.class);
		Color blue = context.getBean("blue1",Color.class);
		Mix mix = context.getBean("mix1",Mix.class);
		red.print();
		blue.print();
		mix.print();
		
	}
}
