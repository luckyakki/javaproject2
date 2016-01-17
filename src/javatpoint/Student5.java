package javatpoint;   // Constructor Overloading//

public class Student5 {
	int id;
	String name;
	int age;
	
	Student5(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    Student5(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
		}
	void obj(){
		System.out.println(id + " "+ name+"  " + age);
		
	}
	
     public static void main(String[] args) {
    	 Student5 s1 = new Student5(1,"sai");
    	 Student5 s2 =new Student5(2,"sap",22);
    	 s1.obj();
    	 s2.obj();
    	 
		

	}

}
