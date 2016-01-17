package constructor_ratan;

 class Emp {
	 int eid;
	 String ename;
	 float esal;
	 
	 Emp(){
		  eid=10;
		  ename="sai";
		 esal=1000.0f;
		 
	 }
	 
	 void disp(){
		 System.out.println("emp id ="+eid);
		 System.out.println("ename ="+ename);
		 System.out.println("emp sal=" +esal);
	 }
	 public static void main(String[] args) {
		Emp e =new Emp();
		e.disp();

	}

}
