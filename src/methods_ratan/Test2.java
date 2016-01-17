package methods_ratan;

public class Test2 {
	void m1(){ //m3 m2
		m2();//m1
		System.out.println("m1 method");
		m2();//m3,m2
		}

	void m2(){
		m3();
		System.out.println("m5 method");
	   }
	
	void m3(){
		System.out.println("m3 method");
	}


	public static void main(String[] args) {
		Test2 t1 =new Test2();
          t1.m1();
	}

}
