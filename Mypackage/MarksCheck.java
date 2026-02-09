package Mypackage;

 class InvalidMarkException extends Exception{
	InvalidMarkException(String msg){
		super(msg);
	}
}

public class MarksCheck {

	public static void main(String[] args) {
		int marks = 120;
		try {
			if(marks<0 || marks>100) {
				throw new InvalidMarkException("Invalid marks are entered ");
			}
			else {
				System.out.println("valid marks"+marks);
			}
		}
		catch(InvalidMarkException e) {
			System.out.println(e.getMessage());
		}
		
		}
		}
		


