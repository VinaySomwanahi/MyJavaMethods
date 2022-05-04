package Tutorials1;

public class Demo3 {
	// non static method without return type and 0 arguments
	
	public void abc() {
		for(int i=40;i>=30;i--)
		{
			if(i!=35)
			{
				System.out.println(i);
			}}
		}
		//non static method without return type and String arguments
	
		public void reverserString(String a) {
			
			for (int i = a.length()-1; i >= 0; i--) 
			{
				System.out.print(a.charAt(i));
			}
			System.out.println();
			}
		  
		//non static method with return type and 0 arguments
		
		public int xyz() {

			int [] abc =new int[5];
			
			abc[0]=10;
			abc[1]=20;
			abc[2]=30;
			abc[3]=40;
			abc[4]=50;
			return abc[4];
			
	  }
		//non static method with String  type and multiple arguments
		

		public String m(String a, String b) {

		
			return a.concat(b);
	}
		
	public static void main(String[] args) {
		
       Demo3 obj=new Demo3();
       obj.abc();
       obj.reverserString("Selenium");
       System.out.println(obj.xyz());
       System.out.println(obj.m("Automation","Tesing"));
       
	}

}
