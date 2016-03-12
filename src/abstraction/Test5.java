package abstraction;
//inside the abstract class is it possible to declare the static block and instance block//
abstract class Parent5 {
	Parent5(){System.out.println("parent class cons");}
	
	{ System.out.println("instance block"); }
	
	static{ System.out.println("static block");}
}
	
	class Test5 extends Parent5{
		Test5(){
			super();
			System.out.println("child normal class const");}
		
		
  public static void main(String[] args) {
	  new Test5();
	  
}
	}

