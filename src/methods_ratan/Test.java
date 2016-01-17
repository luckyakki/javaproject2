package methods_ratan;

 class Test {
	 void m1(int a,char ch){
		 System.out.println("m1 method");
		 System.out.println(a);
		 System.out.println(ch);
		 }
	
	 static void m2(String str,double d){
		System.out.println("m2 method");
		System.out.println(str);
		System.out.println(d);
	   }

	public static void main(String[] args) {
		System.out.println("hiiii");
		Test t1 = new Test();
		t1.m1(11,'d');
		Test.m2("sai", 2.2);

	}

}
