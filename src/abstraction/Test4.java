package abstraction;
//inside the abstract class is it possible to declare the construction and execution of cons//
abstract class Parent1{
	Parent1(){
		System.out.println("abstract class construction");} }

 class Test4 extends Parent1 {
	Test4(){
		super();
		System.out.println("normal class construction"); }
	
	void m1(){
		System.out.println("normal method");
	}

	public static void main(String[] args) {
		new Test4().m1();

	}

}
