package polymorphism_overriding;        // eg 1//
class Parent{   // overridden method signature and overiding method signature both r same //
	 void marry(int a){
		System.out.println("black girl");
	}
}

public class Child extends Parent {
	
	void marry(int a){
		System.out.println("white girl");}

	public static void main(String[] args) {
		new Child().marry(10);

	}

}	
