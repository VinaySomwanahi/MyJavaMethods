package OOPSconcept;

public class ChildOverride extends BaseOverride {

	@Override
	public void b1() {
		System.out.println("b1 method in base");
	}
	@Override
	public void b1(int a) {
		System.out.println("b1 in child"+a);
			
	}
	@Override
	public void b1(String a, int b) {
		System.out.println("b1 in child"+(a+b));
	}
	public void b1(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
	
		 ChildOverride xyz=new ChildOverride();
		 xyz.b1();
		 xyz.b1(22);
		 xyz.b1(45, 5);
		 xyz.b1("Java", 6);
	}

}
