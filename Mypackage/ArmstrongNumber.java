package Mypackage;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a two digit number");
       int num = sc.nextInt();
       int count2 = 0;
       int temp = 0;
       int firstnum = 0;
       int count = 0;
       int total= 0;
       if(num<100) {
    	   firstnum = num/10;
    	   count = firstnum*firstnum;
    	 temp = num%10;
    	 count2 = temp*temp;
    	     total=count+count2;
    	 
       }
       System.out.println("the number is "+total);
       if(total==num) {
    	   System.out.println("this is an armstrong no");
       }
       else {
    	   System.out.println("this is not an armstrong no");

       }
       sc.close();
	}

}
