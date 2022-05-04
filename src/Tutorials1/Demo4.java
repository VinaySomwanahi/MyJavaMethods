package Tutorials1;

public class Demo4 {
	
	public int minimumNumber() {
	int abc []= {100, 200, 300, 400, 500};
	
	int min=abc[0];
	
	for(int i=1;i<abc.length;i++)
	{
		if(abc[i]>min)
		{
			min=abc[i];
		}
		
	}
	return min;
	
	}
	public static void main(String[] args) {
		Demo4 obj=new Demo4();
		obj.minimumNumber();
	
		

	}

}
