package constructor_ratan;
//cons calling//
public class Test2 {
Test2(){
	this(10,20);
	System.out.println("0 arg cons");
}
 
Test2(int a){
	System.out.println("1 arg cons");
}

Test2(int a,int b){
	System.out.println("2 arg cons");
}
	public static void main(String[] args) {
		new Test2();
		new Test2(77);
		
		
		

	}

}
