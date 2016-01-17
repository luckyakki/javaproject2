package inheritance;                 //parent variable//

class Parent{             //same name variable//
int a=10;
int b=20; //super//
}

public class Child extends Parent {
	int a= 100;
	int b=200;             //current class//
	void m1(int a,int b){   //local var//
		System.out.println(a+b);   //local//
		System.out.println(this.a+this.b);//current//
		System.out.println(super.a+super.b);//super//
		}
     
	public static void main(String[] args) {
          new Child().m1(1000, 2000);

	}

}
