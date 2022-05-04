package Tutorials1;

public class Demo7 {
	
	public static String abc(int a, int b, int c) {
		
		if((a>b)&&(a>c))
		{
			return "a is big number";
			
		}else if((b>c)) {
			return "b is big number";
					
		}else
		{
			return "c is big number";
			
		}
		
	}
	

	public static void main(String[] args) {
		
		String a=Demo7.abc(20, 30, 40);
		System.out.println(a);
		

	}

}
