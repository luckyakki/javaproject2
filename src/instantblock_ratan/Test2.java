package instantblock_ratan;

public class Test2 {
	Test2(){
		System.out.println("0 arg cons"); }
	
	Test2(int a){
		System.out.println("1 arg cons"); }
	
	{
		System.out.println("instance block-1");
	}
	{
		System.out.println("instance block-2");
	}

	public static void main(String[] args) {
		new Test2();
		new Test2();

	}

}
