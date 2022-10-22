package useConfigClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//xml������ ����� ����Ŭ����
@Configuration
public class Config {
	
	//<bean id="red1" class="useConfigClass.Red">�� ������ ����� �� �� �ִ�.
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
