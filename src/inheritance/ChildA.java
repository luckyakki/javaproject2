package inheritance;

class ParentK{             //parent class constructor//
	
	ParentK() {
		System.out.println("parent 0 arg cons");   }
	}
 
 class ChildA extends ParentK {
	 ChildA() {
		 this(10);
			 
		//local cons calling//
		 System.out.println("child 0 arg cons");    }
	 
	 ChildA(int a){
		 super();  //parent con calling//
	System.out.println("child 1 arg cons ");   }
	
     public static void main(String[] args) {
    	 new ChildA();
		

	}

}
