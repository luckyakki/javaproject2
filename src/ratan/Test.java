package ratan;
                            //instance variables//
 class Test {
	//instance variables//
	int a=10;
	int b=20;
	
//static method//
	public static void main(String[] args) 
	{ //static area//
		Test t =new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		t.m1();
		}
	//instance method//
	void m1()
	{ //instance area//
		System.out.println(a);
		System.out.println(b);
		
	}

}
