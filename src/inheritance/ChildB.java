package inheritance;
class ParentB {
	
	ParentB(){
	System.out.println("parent o arg cons");   } 
	}

 class ChildB extends ParentB {
	 ChildB(){//compiler wil generate the super keyword at 1st line of con//
		System.out.println("child 0 arg cons");
		     }
	 ChildB(int a){
		 //super(); with 0 arg con//
		 System.out.println("1 arg cons");
	 }
   public static void main(String[] args) {
		new ChildB();
		new ChildB(10);
		}}
//