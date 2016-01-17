package ratan;
 class Test1 {          //static var//
	 static int a=20;
	 static int b=30;
//any type of area we can access by using class name
	public static void main(String[] args) {
		System.out.println(Test1.a);
		System.out.println(Test1.b);
		Test1 t = new Test1();
		t.m1();
		}
	void m1(){
		System.out.println(Test1.a);
		System.out.println(Test1.b);
		
		
	}

}
