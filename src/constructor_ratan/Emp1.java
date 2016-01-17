package constructor_ratan;

public class Emp1 {
	int eid;
	String ename;
	float esal;
	
	Emp1(int eid,String ename,float esal){
		this.eid= eid;
		this.ename=ename;
		this.esal=esal;
	}
	
	void m1(){
		System.out.println("emp id ="+eid);
		System.out.println("emp name ="+ename);
		System.out.println("emp sal ="+esal);
	}

	public static void main(String[] args) {
		Emp1 e1 = new Emp1(10,"sai",1000.0f);
		Emp1 e2 = new Emp1(20,"sap",2000.9f);
		e1.m1();
		e2.m1();

	}

}
