package constructor_ratan;

public class Test {
	void m1(){
		System.out.println("m1 method");
	}
	Test(){ //default/user defined//
		System.out.println("o- arg cons");
	}
	Test(int a){
		System.out.println("1 arg cons");
	}

	public static void main(String[] args) {
		Test t = new Test();
	Test t1 =new Test(10);
		t.m1();
		t1.m1();
		
	}

}
