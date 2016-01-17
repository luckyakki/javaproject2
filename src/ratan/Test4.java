package ratan;

public class Test4 {
	int a= 10;
	int b=20;
	static double c=30;
	static int d=40;
	
void m1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test4.c);
		System.out.println(Test4.d);
	  }
static void m2(){
	Test4 t2 =new Test4();
	System.out.println(t2.a);
	System.out.println(t2.b);
	System.out.println(Test4.c);
	System.out.println(Test4.d);
	
	}
 public static void main(String[] args) {
	Test4 t3 =new Test4();
	t3.m1();
	 Test4.m2();
		
	}

}
