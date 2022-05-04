package Interviewprograms;

public class SeparateCharString {

	public static void main(String[] args) {
		Object [] abc= {'A',2566,"Selenium",'b',897};
		for(int i=0;i<abc.length; i++) {
			if(abc[i].getClass()==Integer.class) {
				System.out.println("integer value is"+abc[i]);
				
			}else if(abc[i].getClass()==Character.class) {
				System.out.println("Character value is"+abc[i]);	
			}else if(abc[i].getClass()==String.class) {
				System.out.println("String value is"+abc[i]);
			}
		}

	}

}
