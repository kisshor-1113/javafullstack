package Mypackage;
import java.util.*;
public class CheckNoorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter a no");
       int no = sc.nextInt();
       if(no+no!='a') {
    	   System.out.println("This is a number");
       }
       else {
    	   System.out.println("This is not a number");
       }
       sc.close();
	}

}
