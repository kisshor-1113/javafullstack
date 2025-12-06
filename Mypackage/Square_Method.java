package Mypackage;

import java.util.Scanner;

public class Square_Method {
	public static int sqare(int a)
	{
		return a*a;
	}

	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		Square_Method obj=new Square_Method();
		int squre=obj.sqare(num);
		System.out.println("Square root is"+squre);

	}

}
