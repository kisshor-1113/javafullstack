package Mypackage;
import java.util.Scanner;

public class Eligibility {
	public static String agess(int age)
	{
		String res=(age>=18)?"eligible to vote":"not eligible";
		return res;
	}

	public static void main(String[] args) {
	System.out.println("Enter your Age");
	Scanner sc=new Scanner(System.in);
	int ag=sc.nextInt();
	Eligibility obj=new Eligibility();
	String result=obj.agess(ag);
	System.out.println("Eligibility test"+result);

	}

}
