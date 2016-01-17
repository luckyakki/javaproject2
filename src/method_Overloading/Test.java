package method_Overloading;

public class Test {
	void m1(int a)  {
		System.out.println("int m1 method");    }
	void m1(int a,int b) {
		System.out.println("int m1,m1 method"); }
	void m1(char c) {
		System.out.println("char m1 method");  }

	public static void main(String[] args) {
		
		new Test().m1(10);
		new Test().m1(10,20);
		new Test().m1('h');
		

	}

}
