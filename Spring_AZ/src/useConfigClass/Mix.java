package useConfigClass;

public class Mix {
	Red red;
	Blue blue;

	public Mix(Red red) {
		this.red = red;
	}

	public void setBlue(Blue blue) {
		this.blue = blue;
	}

	
	public void print() {
		System.out.println("Mix {");
		red.print();
		blue.print();
		System.out.println("}");
	}
	
}
