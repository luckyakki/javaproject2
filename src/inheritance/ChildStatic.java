package inheritance;
class ParentY{
	static {
		System.out.println("parent class static block 1");
	}
	{
		System.out.println("parent class instance block");
	}
}

public class ChildStatic extends ParentY {
	static{
		System.out.println("child class static block");
	}
	ChildStatic(){
		System.out.println("child class o arg cons");
	}

	public static void main(String[] args) {
		new ChildStatic();
		

	}

}
