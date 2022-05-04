package Interviewprograms;

public class Swapnos {

	public static void main(String[] args) {
	
		int a=10, b=20;
		System.out.println("before swapping " +a+"  "+b);
//		
//		int d=a;
//		a=b;
//		b=d;
		
//		By arithmatic operation
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
//		in single statement
		
		b=a+b-(a=b); 
		System.out.println("After swapping "+a+"  "+b);
		
		
	}

}
