package staticblocks;

public class Test1 {
	static int eid;
	
	static{
		eid=18;
	}
	static void disp(){
		System.out.println(eid);
	}

	public static void main(String[] args) {
		Test1.disp();

	}

}
