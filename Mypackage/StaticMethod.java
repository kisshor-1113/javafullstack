package Mypackage;

class StaticXample{
	static int counter=0;
	static void displaycount() {
		System.out.println("The value is"+""+counter);
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		StaticXample.counter=9;
		
		StaticXample.displaycount();

	}

}
