package Mypackage;
class Single1{
private static	Single1 obj=new Single1();
	private Single1() {
	}	
		public static Single1 getInstance() {
			return obj;
		}
		public void message(String msg) {
			System.out.println("there is a print manager in your area"+""+msg);
		}
	}
	class Emp{
		void useSingle() {
			Single1 s=Single1.getInstance();
			s.message("keep rocking");
		}
	}

public class SingleetonBuilt {

	public static void main(String[] args) {
		Emp e=new Emp();
		e.useSingle();	

	}

}
