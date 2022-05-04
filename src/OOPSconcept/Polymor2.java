package OOPSconcept;

public class Polymor2 extends Polymorphism {
	
	public void b1() {
		System.out.println("Cucumber");
	}
	public static void b2() {
		System.out.println("Java");
	}
	public void a1(int a, int b) {
		System.out.println("a1 method in oops"+(a+b));
	}
	
	public static void main(String[] args) {
		
		Polymor2 obj=new Polymor2();
		obj.b1();
		Polymor2.b2();
		obj.a1();
		obj.a1(20, "Selenium");
		obj.a1("Selenium",220);
		obj.a1(12, 58);
	}

}
