package inheritance;
class ParentD{             //parent class instance block==1//
	{
		System.out.println("parent class instance block ");
	}
}

 class ChildD extends ParentD {
	 {
		 System.out.println("child class instance block ");
	 }

	public static void main(String[] args) {
		new ChildD();
		new ChildD();
		

	}

}
