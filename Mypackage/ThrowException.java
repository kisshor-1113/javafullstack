package Mypackage;

public class ThrowException {

  static void checkage(int age) {

	
		if(age>19) {
			throw new IllegalArgumentException("Access Denied");
		}
		else {
     System.out.println("Access granted");
	}
  }
		public static void main(String[] args) {

		checkage(19);
		}
}
		
		
