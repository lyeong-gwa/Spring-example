package useConfigClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//xml문서를 대신할 설정클래스
@Configuration
public class Config {
	
	//<bean id="red1" class="useConfigClass.Red">와 동일한 기능을 할 수 있다.
	@Bean
	public Red red1() {
		Red red = new Red();
		red.setValue(1);
		return red;
	}
	@Bean
	public Blue blue1() {
		Blue blue = new Blue(2);
		return blue;
	}
	@Bean
	public Mix mix1() {
		Red red = new Red();
		red.setValue(1);
		Blue blue = new Blue(2);
		Mix mix = new Mix(red);
		mix.blue = blue;
		return mix;
	}
	
}
