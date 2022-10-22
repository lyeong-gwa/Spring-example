package useFactory;

public class ColorFactory {
	public Color getColor(String color){
		if(color.equals("red")) {
			return new Red();
		}else {
			return new Blue();
		}
	}
}
