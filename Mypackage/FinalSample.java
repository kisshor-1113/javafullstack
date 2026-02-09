package Mypackage;
class Sampling{
	final int a;
	Sampling(int value){
		a=value;
	}
	void show() {
		System.out.println("Max"+""+a);
		// not possible due to final a=102;
	}
}
public class FinalSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sampling s=new Sampling(50);
		s.show();

	}

}
