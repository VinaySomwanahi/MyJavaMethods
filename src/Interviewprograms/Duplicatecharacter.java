package Interviewprograms;

public class Duplicatecharacter {

	public static void main(String[] args) {
		String abc="Pune Mumbai P";
		char[]xyz=abc.toCharArray();
		for(int i=0;i<abc.length();i++) 
		{
			for(int j=i+1;j<abc.length();j++)
			{
				if(xyz[i]==xyz[j]) {
					System.out.println(xyz[j]);
					break;
				}
			}
		}

	}

}
