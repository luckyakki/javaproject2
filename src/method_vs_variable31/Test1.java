package method_vs_variable31;
//if application contain  instance variable the priority goes instance variable//
public class Test1 {
	int a=100;
	int m1(){
		System.out.println("m1 method");
		return a; 
	}

	public static void main(String[] args) {
		Test1 t1=new Test1();
		int x=t1.m1();
      System.out.println(x);
	}

}
