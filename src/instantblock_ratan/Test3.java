package instantblock_ratan;

public class Test3 {
	Test3(){
		this(10);		
		System.out.println("0 arg cons"); }
	
	Test3(int a){
		System.out.println("1 arg cons"); }
	
	{
		System.out.println("instance block-1");
	}
	{
		System.out.println("instance block-2");
	}

	public static void main(String[] args) {
		new Test3();
		
		

	}

}
