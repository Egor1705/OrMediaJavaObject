package main;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA a1 = new ClassA("Vasa", 3);
		ClassA a2 = new ClassA();
		System.out.println(a1.getName()+" "+ a1.getValueA());
		System.out.println(a2.getName()+" "+ a2.getValueA());
		
		ClassA a = new ClassA("G",5);
		ClassB bg = new ClassB(a.getName(),6,a.getValueA());
		System.out.println(bg.toString());
		
		ClassB b = new ClassB("Vasa",1,1);
		System.out.println(b.getName());
		ClassA b1 = new ClassB("Pete",1,1);
		System.out.println(b1.getName());
		
	exerciseStar();
	Something.k();
	}
	
	public static void exerciseStar() {
		String line1 = "line";
		String line2 = "line";
		String line3 = new String("line");
		System.out.println(line1==line2);//as I understand from the net,we've got true
		//because it's done at compiler level to save memory.It only happends  with String literals.
		System.out.println(line1==line3);
	}

}
