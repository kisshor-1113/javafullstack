package Mypackage;

import java.util.Scanner;
public class Atmwithdraw  {
	public static void main(String[] args) {
System.out.print("Enter the degree in celsious");
		Scanner sc=new Scanner(System.in);
	float degree=sc.nextFloat();
    if((degree>=10.0) && (degree<=16.0)) {
       System.out.println("The climate is too cold");

	}	
	
	else if((degree>=17.0) && (degree<=25.0)) {
	       System.out.println("The climate is too warm");

		}	

   else if((degree>=26.0 && degree<=45.0)) {
    System.out.println("The climate is too cold");

	}	
	else {
		System.out.println("The climate is not able to predict");
	}
	
	
	}
	
	
}