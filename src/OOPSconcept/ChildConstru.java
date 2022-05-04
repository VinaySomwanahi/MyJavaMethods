package OOPSconcept;

public class ChildConstru extends ParentConstru {
	int l=60;
	String b="Vinay";
	public ChildConstru() {
		System.out.println("0 arg method in child");
	}
	public ChildConstru(int a) {
		this();
		System.out.println("1 arg method in child"+a);
		System.out.println(this.l);
		System.out.println(this.b);
		System.out.println(super.s);
		
	}
	 ChildConstru(String s) {
		 this(10);
		 System.out.println("string mathod in child"+s);
		
	}
	
	public static void main(String[] args) {
		ChildConstru obj=new ChildConstru();
		ChildConstru xyz=new ChildConstru(22);
		ChildConstru xy=new ChildConstru("java");
	}

}
