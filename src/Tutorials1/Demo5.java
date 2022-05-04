package Tutorials1;

public class Demo5 {
	public int maximumNumber() {
		int abc[] = { 100, 3000, 50, 600, 7000, 140 };

		int min = abc[0];

		for (int i = 1; i < abc.length; i++) 
		{
			if (abc[i] < min) {
				min = abc[i];
			}
		}
			return min;
		}

	

	public static void main(String[] args) {

		Demo5 obj = new Demo5();
		int a = obj.maximumNumber();
		System.out.println(a);

	}

}
