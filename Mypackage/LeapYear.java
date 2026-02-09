package Mypackage;
import java.util.*;
public class LeapYear {
 public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a year");
		 int year = sc.nextInt();
		 if(year%4==0) {
			 System.out.println("it's a leap year");
		 }
		 else {
			 System.out.println("it's not a leap year");

		 }
		 sc.close();
	 }
 }

