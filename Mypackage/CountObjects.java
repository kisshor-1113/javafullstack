package Mypackage;
class Count{
	static int counter=0;
	Count(){
		counter++;
	}
}
public class CountObjects {

	public static void main(String[] args) {
	new Count();
	new Count();
	new Count();
	System.out.println("the count of objects is:"+Count.counter);

	}

}
