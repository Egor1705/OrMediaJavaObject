package main;

public class ClassB extends ClassA {

	private int valueB;

	
	public ClassB(String name, int valueA, int valueB) {
		super(name,valueA);//As I see, we should change the access modifier on parent class fields
		this.valueB = valueB;
		// TODO Auto-generated constructor stub
	}


	public int getValueB() {
		return valueB;
	}


	public void setValueB(int valueB) {
		this.valueB = valueB;
	}

	
	
}
