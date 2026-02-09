package Mypackage;
import java.util.*;
public class JavaTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num = sc.nextInt();
		
		int fact=1;
     for(int i=1;i<=num;i++) {
    	 if(num>0) {
    		 fact = fact * i;
    	 }
    	 System.out.println(fact);
     }
   sc.close();
	}

}
