package Mypackage;
import java.util.Scanner;
public class Methood {
	public static int calculateTotal(int a,int b,int c)
	{
	return a+b+c;
	}
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks");
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();

Methood obj=new Methood();
int result=obj.calculateTotal(m1,m2,m3);
System.out.println("the total is"+result);
	}

}
