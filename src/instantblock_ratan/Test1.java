package instantblock_ratan;

public class Test1 {
	Test1(){
		System.out.println("0 arg cons"); }
     
	Test1(int a){
		System.out.println("1 arg cons"); }
	
	Test1(int a,int b){
		System.out.println("2 arg cons"); }
	
	{ 
		System.out.println("instance block");
	}
	public static void main(String[] args) {
		new Test();
		new Test1(12);
		new Test1(11,22);
		

	}

}
