package inheritance;

 class A {
	 void m1(){
		 System.out.println("m1 method");
		 System.out.println("m2 method");}
	 }
 class B extends A{
	void m2(){
		 System.out.println("m3 method");
		 System.out.println("m4 method");}
	 }
	class C extends B{
		void m3(){
			 System.out.println("m5 method");
			 System.out.println("m6 method");}
		
			public static void main(String[] args) {
				new B().m1();
				new B().m2();
				
				new C().m1();
				new C().m2();
				new C().m3();
				
			 }
			 }
	

	


