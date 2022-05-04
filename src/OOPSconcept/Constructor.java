package OOPSconcept;

public class Constructor {
	int s=500;
	
	public Constructor() {
		System.out.println("0 arg metod in constructor");
	}
	public Constructor(int a) {
		System.out.println("1 arg mathod in constructor"+a);
	}
	public Constructor(String a) {
		System.out.println("1 arg mathod in constructor"+a);
		
	}
	public Constructor(String a, int s) {
		System.out.println("1 arg mathod in constructor"+(a+s));
		System.out.println(this.s);
	}
	public void m1() {
		System.out.println("0 arg method");
	}
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		Constructor obj2=new Constructor("10");
		Constructor abc=new Constructor(10);
		Constructor xy=new Constructor("10", 200);
		obj.m1();
	
	

	}

}
