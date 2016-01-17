package ratan;

 class Test2{  //assignment1 //
	 int a = 10;
	float  b = 20.6f;
	
	static void m1(){
		Test2 t1 = new Test2();
		System.out.println(t1.a);
		System.out.println(t1.b);
		}
     
	static void m2(){
		Test2 t2 = new Test2();
		System.out.println(t2.a);
		System.out.println(t2.b);
	    }
	
	 public static void main(String[] args) {
		Test2.m1();
		Test2.m2(); 
		

	}

}
