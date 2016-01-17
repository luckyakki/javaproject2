package ratan;  //static variable accessing is //
                 //3 ways in java//

 class Test3 {
	static int a= 20;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Test3.a);
		
		Test3 t = new Test3();
		System.out.println(t.a);

	}

}
