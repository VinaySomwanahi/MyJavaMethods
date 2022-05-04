package OOPSconcept;

public class ParentConstru {
	int s=5000;
	int f=50000;
	 public ParentConstru() {
		 System.out.println("0 arg method in parent");
	 }
	 public ParentConstru(String a) {
		 this();
		 System.out.println("1 arg method in parent"+a);
		 
	 }
	 public ParentConstru(String a, String b) {
		 this("100");
		 System.out.println("2 arg method in parent"+(a+b));
	 System.out.println(this.s);
	 }
	 
		 

	public static void main(String[] args) {
		
		ParentConstru obj=new ParentConstru("10"," Java");
	}

}
