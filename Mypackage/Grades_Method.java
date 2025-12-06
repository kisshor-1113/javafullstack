package Mypackage;
import java.util.Scanner;
public class Grades_Method {
 public static void grad(int id,String name,String grade) {
	 System.out.println("id is:"+ id);
	 System.out.println("name is :" +name);
	 System.out.println(" grade is :"+ grade);
 }
 public static void main(String[] args) {
	 System.out.println("Enter a your id");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println("Enter a your name");
		String s1=sc.next();
		System.out.println("Enter a your grade");
		String s2=sc.next();
	Grades_Method obj=new Grades_Method();
		obj.grad(s, s1, s2);
		
		
 }
 
}
