package Tutorials1;

public class Demo6 {
	
	public void m1(){
		System.out.println("selenium");
	}
	public void m2(int a, int b) {
		System.out.println(a+b);
	}
	public int m3(){
		int a=10;
		int b=20;
		return a*b;	
	}
	public boolean m4(String a, String b) {
		
		return a.equals(b);
	}
	public static void m5() {
		System.out.println("TestNG");
	}
	public static void m6(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static String m7()
	{
		String a="Github";
				String b="Mywork";
		return a.concat(b);
	}
	public static boolean m8(int a, int b) {

		return a>b;
	}
	


	public static void main(String[] args) {
		Demo6 obj=new Demo6();
		obj.m1();
		obj.m2(100,200);
		int c=obj.m3();
		System.out.println(c);
	
		System.out.println(obj.m4("Hotspot", "Tesing"));
		
		Demo6.m5();
		Demo6.m6(20, 30, 40); 
		System.out.println(Demo6.m7());
		System.out.println(Demo6.m8(17, 20));
		
		
		
	}
}