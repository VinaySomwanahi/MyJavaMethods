package OOPSconcept;

public class Demo2 extends Demo1 {
	
	public void d1() {
		System.out.println("d1 in demo2");
	}
	public void d2() {
		System.out.println("d2 in demo2");
	}
	public static void main(String[] args) {
		
		Demo2 obj=new Demo2();
		obj.S1();
		obj.S2();
		obj.S3();
		

		obj.d1();
		obj.d2();

	}

}
