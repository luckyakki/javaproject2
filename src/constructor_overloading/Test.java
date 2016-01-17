package constructor_overloading;

public class Test {
	Test(int a){
		System.out.println("int a arg"  + a);  }
	Test(int a,int b){
		System.out.println("int a,int b  arg"+ (a+b)); }

	public static void main(String[] args) {
		new Test(10);
		new Test(10,20);

	}

}
