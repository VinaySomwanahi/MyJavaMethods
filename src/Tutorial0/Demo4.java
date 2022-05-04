package Tutorial0;

public class Demo4 {

	public static void main(String[] args) {

		int a=5000,b=2000,c=25000,d=90;
		
		if((a>b)&&(a>c)&&(a>d))
		{
			System.out.println(("a is big no"));
		}else if((b>c)&&(c>d))
		{
			System.out.println("b is big no");
		}else if((c>d))
		{
			System.out.println("c is big no");
			
		}else {
			System.out.println("d is big no");
		}
	}

}
