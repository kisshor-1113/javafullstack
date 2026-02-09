package Mypackage;
import java.util.Scanner;
public class Logics {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a no");
//		int n1=sc.nextInt();		
//		System.out.println("enter a no");
//		int n2=sc.nextInt();	
//		System.out.println("enter a no");
//		int n3=sc.nextInt();	
//		System.out.println("enter a no");
//		int n4=sc.nextInt();	
//		System.out.println("enter a no");
//		int n5=sc.nextInt();	
//		
//		
//		
//		float res=n1+n2+n3+n4+n5/5;
//		System.out.println("the result is"+res);
//		
		
		System.out.println("Factorial");	
		System.out.println("enter a no");
	int n1=sc.nextInt();	
	int fac=0;
	for(int i=1;i<=n1;i++)
	{
	fac=fac*i;
	System.out.println("the fact is"+fac);
		
	}
	 sc.close();
 }
}	
