package Mypackage;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the integer");
	int i=sc.nextInt();
	System.out.println("the integer is"+i);
	
	
	System.out.println("enter float");
	float f=sc.nextFloat();
	System.out.println("the float is"+f);
	
	System.out.println("enter double");
	double d=sc.nextDouble();
	System.out.println("the float is"+d);
	
	System.out.println("enter small");
	short s=sc.nextShort();
	System.out.println("the float is"+s);
	
	System.out.println("enter boolean");
	boolean b=sc.nextBoolean();
	System.out.println("the boolean is"+b);
	
	System.out.println("enter the character");
	char c=sc.next().charAt(0);
	System.out.println("the character is"+c);
	
	System.out.println("enter long");
	long l=sc.nextLong();
	System.out.println("the long is"+l);
	
	System.out.println("enter byte");
	byte bi=sc.nextByte();
	System.out.println("the byte is"+bi);
	
	
	
	
	
	
	
	
	}
}
