package main;

public class ClassA {

	private int valueA;
	private String name;
	
	public ClassA() {
		
	}
	
	public ClassA(String name,int valueA) {
		this.name = name;
		this.valueA = valueA;
	}

	public int getValueA() {
		return valueA;
	}

	public void setValueA(int valueA) {
		this.valueA = valueA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
