package methods_ratan;

public class Test3{        //this key//
int x = 100;
int y = 200;
void add(int x,int y){
	System.out.println(x+y);
	System.out.println(this.x+this.y);
	
	
}
	public static void main(String[] args) {
		Test3 t =new Test3();
		t.add(111, 222);
	
    
        
	}

}
