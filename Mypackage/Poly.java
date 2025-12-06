package Mypackage;
class Place{
	void go(String pla) {
		System.out.println("going to"+pla);
	}
	
	void go(String pla,int time) {
		System.out.println("going to"+pla+"at"+time);
	}
	
	void go(String pla,String trans) {
		System.out.println("going to"+pla+"by"+trans);
	}
	void go(String pla,float dis) {
		System.out.println("going to"+pla+"distance"+dis);
	}
	
}
public class Poly {

	public static void main(String[] args) {
		Place p=new Place();
		p.go("Delhi");
		p.go("Delhi",2);
		p.go("Delhi","trans,plane");
		p.go("Delhi",45.0f);
		
		

	}

}
