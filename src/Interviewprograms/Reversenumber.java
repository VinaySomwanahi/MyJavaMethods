package Interviewprograms;

public class Reversenumber

{

	public static void main(String[] args) {
	     int n=3553, reverseNum=0, remainder ;
	        int originalNum=n;
	        while(n>0){
	            remainder=n%10;
	            reverseNum=(reverseNum*10)+remainder;
	            n=n/10;
	        }
	        System.out.println(reverseNum);
	        
	if(originalNum==reverseNum){
        System.out.println("no is palindrome" +reverseNum);
    }
    else{
        System.out.println(reverseNum+ "no is not palindrome");
    }

	}
}

