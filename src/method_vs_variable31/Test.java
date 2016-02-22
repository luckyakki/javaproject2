package method_vs_variable31;

public class Test {
	int a=100;//instance var //
	int m1(int a)//local var//
	{
		System.out.println("m1 method");
		return a;
	}

	public static void main(String[] args) {
    Test t =new Test();
    int x=t.m1(10);
    System.out.println("method return value =" + x);
	}

}
