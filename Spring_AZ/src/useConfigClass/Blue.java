package useConfigClass;

public class Blue implements Color {
	int value;
	
	public Blue(int value) {
		this.value = value;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("blue: "+value);
	}

}
