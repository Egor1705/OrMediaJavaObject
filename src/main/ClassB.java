package main;

public class ClassB extends ClassA {

	private int valueB;

	
	public ClassB(String name, int valueA, int valueB) {
		super(name,valueA);
		this.valueB = valueB;
		// TODO Auto-generated constructor stub
	}


	public int getValueB() {
		return valueB;
	}


	public void setValueB(int valueB) {
		this.valueB = valueB;
	}


	@Override
	public String toString() {
		return "ClassB [valueB=" + valueB + ", valueA=" + valueA + ", name=" + name + "]";
	}

	
	
}
