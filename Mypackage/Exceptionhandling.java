package Mypackage;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k= 10;
int m = 0;
		
try {
	int s = k/m;
	System.out.println("The answer is "+s);
}
catch(Exception e) {
	System.err.println("Error divide by 0"+e);
}
		
		
		
	}

}
