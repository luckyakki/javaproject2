package staticblocks;

public class Test {
	{  System.out.println("intance blocl-1");  }
	{  System.out.println("instance block-2"); }
	
	static { System.out.println("static block-1"); }
	static { System.out.println("static block-2"); }
	
	Test() {  System.out.println("0 arg cons-1");  }
	Test(int a) {  System.out.println("1 arg cons-2"); }
		
	
	public static void main(String[] args) {
		new Test();
		

	}

}
