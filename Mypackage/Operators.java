
package Mypackage;

import java.util.Scanner;

public class Operators {
	public static void main(String[]args) {
	Scanner sc =new Scanner(System.in);
	
		System.out.println("enter a value for A");
		System.out.println("Enter a value for B");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//arithmetic
		System.out.println("a+b= "+(a+b));
		System.out.println("a-b= "+(a-b));
		System.out.println("a*b= "+(a*b));
		System.out.println("a/b= "+(a/b));
		System.out.println("a%b= "+(a%b));
		
		//relational
		System.out.println("a=b "+(a=b));
		System.out.println("a!=b "+(a!=b));
		System.out.println("a>b "+(a>b));
		System.out.println("a<b "+(a<b));
		System.out.println("a>=b= "+(a<=b));
		System.out.println("a<=b= "+(a>=b));
		
		//Logical 
		boolean k=true,i=false;
		System.out.println("k&&i= "+(k&&i));
		System.out.println("k||i= "+(k||i));
		System.out.println(" !k"+(!k));
		
		//increment or decrement
		System.out.println("a  = "+a);
		System.out.println("++a= "+(++a));
		System.out.println("after ++a= "+(a));
		
		
		System.out.println("a "+a);
		System.out.println("a++= "+(a++));
		System.out.println("after a++= "+(a));
		
		//decrement
		System.out.println("a  = "+a);
		System.out.println("--a= "+(--a));
		System.out.println("after --a= "+(a));
		
		
		System.out.println("a "+a);
		System.out.println("a--= "+(a--));
		System.out.println("after a--= "+(a));
		
		//Assignment
		System.out.println("a+= "+(a+=5));
		System.out.println("a-= "+(a-=6));
		System.out.println("a*== "+(a*=6));
		System.out.println("a/= "+(a/=5));
		
		
		
		int age=50;
				String res=(age>=18)?"Adult":"child";
		System.out.println("The result is"+res);
	
		
		
		
		
		
		
	}


}
