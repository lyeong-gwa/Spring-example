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
	//@Qualifier("blue1") //없어도 type -> 변수명 -> Qualifier 순서대로 탐색함
	Blue blue;

	
	
	public void print() {
		System.out.println("Mix {");
		red.print();
		blue.print();
		System.out.println("}");
	}
	
}
