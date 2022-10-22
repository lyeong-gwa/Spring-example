package useAop;

public class Mix {
	Red red;
	Blue blue;

	public Mix() {
		super();
	}

	public void setRed(Red red) {
		this.red = red;
	}

	public void setBlue(Blue blue) {
		this.blue = blue;
	}

	public Red getRed() {
		return red;
	}

	public Blue getBlue() {
		return blue;
	}

	public void print() {
		System.out.println("Mix {");
		red.print();
		blue.print();
		System.out.println("}");
	}

}
