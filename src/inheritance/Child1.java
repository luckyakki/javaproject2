package inheritance;

 class Parent1 {       //same method name //
	void m1(){
		System.out.println("parent m1 method");}
}
	
	class Child1 extends Parent1{
		void m1(){
		System.out.println("child m1 method");}
	
	     void m2(){
		   this.m1();
		   super.m1();}

	public static void main(String[] args) {
		new Child1().m2();
		
		
	
	}}


