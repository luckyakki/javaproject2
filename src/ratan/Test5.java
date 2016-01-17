package ratan;
//main difference between instance and static//
 class Test5 {
int a =10;
static int b =20;

	public static void main(String[] args) {
		Test5 t1 = new Test5();
		System.out.println(t1.a);
		System.out.println(t1.b);
		t1.a=99;
		t1.b=100;
		System.out.println(t1.a);
		System.out.println(t1.b);
		
		Test5 t2 =new Test5();
		System.out.println(t2.a);
		System.out.println(t2.b);
		t2.a=111;
		t2.b=222;
		System.out.println(t2.a);
		System.out.println(t2.b);
		
		Test5 t3 =new Test5();
		System.out.println(t3.a);
		System.out.println(t3.b);
		
		
		
		

	}

}
