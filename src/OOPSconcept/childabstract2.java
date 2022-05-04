package OOPSconcept;

public class childabstract2 extends Childabstract1{

	public static void main(String[] args) {
		
		Childabstract1 obj=new childabstract2();
		obj.pqr();
		obj.xyz();
		obj.s1();
		obj.abc();
		
	}

	@Override
	public void d1() {
		// TODO Auto-generated method stub
		
	}
	public void p1()
	{
		System.out.println("P1 method in child2 class");
	}

}
