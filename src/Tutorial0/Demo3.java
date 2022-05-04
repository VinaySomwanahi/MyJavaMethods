package Tutorial0;

public class Demo3 {

	public static void main(String[] args) {
		int a=100;
		int b=90;
		int c=80;
		
		System.out.println((a>b)&&(b>c));
		System.out.println((a>b)||(b>c));
		System.out.println((a<b)&&(b>c));
		System.out.println((a!=b)||(b>c));
		System.out.println(!(a<b)&&(b>c));
		
		int x=80;
		int y=50;
		int z=100;
		
		boolean d=x>y;
		System.out.println(d);
		boolean e=x>z;
		System.out.println(e);
		
		System.out.println(d&&e);//f
		System.out.println(d||e);
		System.out.println(!(d||e));

	}

}
