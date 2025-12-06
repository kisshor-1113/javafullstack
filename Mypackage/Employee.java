package Mypackage;
import java.util.Scanner;
public class Employee {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your employee id");
		int i=sc.nextInt();
		System.out.println("employee id is"+i);
		
		System.out.println("enter your employee name");
		String s=sc.next();
		System.out.println("employee name is"+s);
		
		System.out.println("enter your employee Salary");
		long l=sc.nextInt();
		System.out.println("employee salary is"+l);
		
		System.out.println("enter your employee designation");
		String k=sc.next();
		System.out.println("employee designation is"+k);
		
		System.out.println("enter your employee city");
		String h=sc.next();
		System.out.println("employee String is"+h);
	}
}
