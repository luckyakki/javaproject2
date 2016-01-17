package javatpoint; //parameterized constructor//

 class Student4 {
	 int id;
	 String name;
	 
	 Student4(int i,String n){
		 id = i;
		 name = n;
	 }
	 
	void display(){
		System.out.println(id + " " + name);
	 }
	
  public static void main(String[] args) {
	  Student4 b1 = new Student4(1,"shai");
	  Student4 b2 = new Student4(2,"sap");
	  
	  b1.display();
	  b2.display();
	  
	  
	  		
		
	}

}
