package Interviewprograms;

public class palindromestring {
static int i;
	public static void main(String[] args) {
		
		String str="Madam";
		String b=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		if(b.equalsIgnoreCase(rev)) {
			System.out.println(b+" is palindrome string");
		}
		else {
			System.out.println(b+"  is not palindrome string");
		}
	
	}

}
