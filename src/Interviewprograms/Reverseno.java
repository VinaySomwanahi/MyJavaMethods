package Interviewprograms;

import java.util.Scanner;

public class Reverseno {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
//		using StringBuffer class
		StringBuffer sb=new StringBuffer(String.valueOf(num)); 
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse no is "+rev);
		
		
		//using StringBuilder class
		
//		StringBuilder sbl=new StringBuilder();
//		sbl.append(num);
//		StringBuilder rev=sbl.reverse();
//		System.out.println("Reverse no is "+rev);

	}

}
