package Mypackage;

public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  int arr [] = new int [5];
        	  arr [10] = 52;
          }
          catch(ArithmeticException e) {
        	  
        	  System.out.println("Exception on arithmetic"); 
          }
          catch(ArrayIndexOutOfBoundsException e) {
        	  System.out.println("Exception on array");     
          }
          catch(Exception e) {
        	  System.out.println("Exception generic");     
          }
	}

}
