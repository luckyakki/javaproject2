package staticblocks;

 class A {
	
	static {
		System.out.println("static block-1");
	}

	public static void main(String[] args) throws ClassNotFoundException { 
		Class.forName("B.Class");
		Class.forName("A.Class");
	}

}
