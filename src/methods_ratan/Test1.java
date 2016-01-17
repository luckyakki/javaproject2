package methods_ratan;//method expecting objects//
class X{}
class Emp{}
class Y{}
class Student{}

 class Test1 {
	void m1(X x,Emp e){
		System.out.println("m1 method");
	}
static void m2(Y y,Student s){
	System.out.println("m2 method");
}
	public static void main(String[] args) {
		Test1 t1 =new Test1();
		X x1 =new X();
		Emp e1 =new Emp();
		t1.m1(x1,e1); //t1.m1(new X(),new Emp())//
		
       Y y1 =new Y();
       Student s =new Student();
       Test1.m2(y1, s);//Test1.m2(new Y(),new Student())//
      
	}

}
