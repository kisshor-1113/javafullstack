package Mypackage;

import java.util.Scanner;

public class Stu_Grade {
	public static String getgrade(int marks)
	{
		return (marks >= 90) ? "o" :
		   (marks >= 80) ? "A" :
		   (marks >= 70) ? "B" :
		   (marks >= 60) ? "C" :
		   (marks >= 50) ? "D" :
		   (marks >= 40) ? "E" :
			"F";
	}
	public static void main(String[] args) {
		System.out.println("ENTER YOUR MARK");
		Scanner sc=new Scanner(System.in);
	int mar=sc.nextInt();
	Stu_Grade obj=new Stu_Grade();
	 String student=obj.getgrade(mar);
	 System.out.println("THE RESULT IS   "+student);
	 

	}

}
