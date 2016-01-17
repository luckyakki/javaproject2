package javatpoint;       //default constructor//

public class Bike1 {
	Bike1(){
		System.out.println("Bike is creatd");
		
	}
	Bike1(String name){
		System.out.println("this is "+ name + " Bike is creatd");
		
	}
	Bike1(String name1,String name2){
		System.out.println("this is "+ name1 +" "+ name2   + " Bike is creatd");
		
	}
	public static void main(String[] args) {
		new Bike1();
		new Bike1("ram");
		new Bike1("ram","sam");
		
		
		
		
		

	}

}
