package useAop;

public class Blue implements Color {
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("blue: " + value);
	}

}
