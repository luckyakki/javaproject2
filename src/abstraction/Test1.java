package abstraction;
/*the abstract class may contain abstract method or may not contain abstract method but for abstract class
object creation for class is not possible*/
abstract class Test{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4(){
		System.out.println("normal method m4"); 
	}
}

public class Test1 extends Test {
  void  m1(){
	  System.out.println("method m1");}
  void  m2(){
	  System.out.println("method m2");}
  void  m3(){
	  System.out.println("method m3");}
  
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		
		//parent p = new child(); //
		Test p = new Test1();
		p.m1();  /*compile time compiler checking methods in parent class but at runtime which class 
		   object is created that class methods will be executed */
		p.m2();
		p.m3();
		p.m4();
		
		
		
		

	}

}
