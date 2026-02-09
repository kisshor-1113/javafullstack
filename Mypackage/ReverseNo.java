package Mypackage;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
			int n1=sc.nextInt();
		System.out.println("Enter the second number");
			int n2=sc.nextInt();
		 // System.out.println("Reverse the numbers");
		   
		   int rev =0;
		   
		   
		   while(n1>0) {
			   int k =n1%10;
		     rev=rev*10;
		     n2=n2/10;
		}
		 
		  // System.out.println("s");
			System.out.println("Reversed num2 is"+ rev);
		 sc.close();
			}
		



	}


