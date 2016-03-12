package abstraction;
abstract class Parent {
 abstract void m1();
 abstract void m2();
 abstract void m3();  }
 
 abstract class TestA extends Parent {
 void m1(){ System.out.println("normal method m1 "); }}
 
  class Test2 extends TestA{
	 void m2(){System.out.println("normal method m2");}
	 void m3(){System.out.println("normal method m3");}
	
 
	public static void main(String[] args) {
		Test2 t1 = new Test2();
		t1.m1();
		t1.m2();
		t1.m3();
	}}


