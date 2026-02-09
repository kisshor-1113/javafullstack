package Mypackage;
 
public class ExceptionAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String age = "Eleven";
		try {
			int k = Integer.parseInt(age);
			System.out.println(k);
		}
		catch(Exception e) {
			System.out.println("Invalid dta type"+e);
		}
	}

}
