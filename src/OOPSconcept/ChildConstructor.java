package OOPSconcept;

public class ChildConstructor extends Constructor {
	int v=400;
	
	public ChildConstructor() {
		System.out.println("0 arg method in child");
	}
	public ChildConstructor(int r) {
		System.out.println("1 arg method in child"+r);
		System.out.println(this.v);
		System.out.println(super.s);
	}
	public ChildConstructor(String a) {
		System.out.println(" 1 string arg method in child"+a);
	}
	public static void main(String[] args) {
	
		ChildConstructor obj=new ChildConstructor(20);
		ChildConstructor cvb=new ChildConstructor("20");
	}

}
