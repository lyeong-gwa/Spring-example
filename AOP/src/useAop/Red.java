package useAop;

public class Red implements Color {
	int value;
	
	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("red: " + value);
	}

}
