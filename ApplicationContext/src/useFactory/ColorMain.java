package useFactory;

public class ColorMain {
	public static void main(String[] args) {
		Color red = new ColorFactory().getColor("red");
		Color blue = new ColorFactory().getColor("blue");
		
		red.print();
		blue.print();
	}
}
