package useAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mix")
public class Mix {
	@Autowired
	@Qualifier("red1")
	Red red;
	
	@Autowired
	//@Qualifier("blue1") //��� type -> ������ -> Qualifier ������� Ž����
	Blue blue;

	
	
	public void print() {
		System.out.println("Mix {");
		red.print();
		blue.print();
		System.out.println("}");
	}
	
}
