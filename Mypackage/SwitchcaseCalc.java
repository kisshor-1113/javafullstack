package Mypackage;
import java.util.Scanner;
public class SwitchcaseCalc {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
		int n1=sc.nextInt();
	System.out.println("Enter the second number");
		int n2=sc.nextInt();
//		
//		System.out.println("select your choice");
	System.out.println("1: Addition");
//		System.out.println("2: Subtraction");
//		System.out.println("3: multiplication");
//		System.out.println("4: Division");
//		boolean condition=true;
//		while(condition) {
//		int choice=sc.nextInt();
//		switch(choice)
//		{
//		case 1:
   int total=(n1+n2);
//			break;
//			
//		case 2:
//			System.out.println("Sub the no  "+(n1-n2));
//			break;
//			
//		case 3:
//			System.out.println("Multi the no  "+(n1*n2));
//			break;
//			
//		case 4:
//			System.out.println("Divide the no  "+(n1/n2));
//			break;
//			
//			default:
//				System.out.println("Your choice is invalid select again");
//			
//			
//		}
//		System.out.println("Do you want to continue or not");
//		String ch=sc.next();
//		if(ch=="yes") {
//			condition= true;
//		}
//		else {
//			condition = false;
//		}
		
//		Random rand=new Random();//library like scanner
//		
//		int dice=rand.nextInt(6)+1;//
//		System.out.println("Your rolled :"+dice);
		
	
	if(total>50) {
		System.out.println("The no is greater than 50");
		}
	else if(total>=10 && total<=20) {
		System.out.println("The no is between than 10 to 20");
	}
	
	else if(total>=21 && total<=30) {
		System.out.println("The no is between than 21 to 30");
	}
	
	else if(total>=31 && total<=40) {
		System.out.println("The no is between than 31 to 40");
	}
	
	else if(total>=40 && total<=50) {
		System.out.println("The no is between than 41 to 50");
	}
	
	else
	{
	System.out.println("your no is invalid");	
     }
	
   for(int i=2;i<=7;i++)
   {
	   if(total%i==0)
	   System.out.println("it is divisible by"+i);
 
   }
   
   System.out.println("Reverse the numbers");
   int sum=0;
   int rev =0;
   
   while(n1>0) {
	   int dk =n1%10;
     rev=rev*10;
     n2=n2/10;
}
	System.out.println("Reversed num2 is"+ rev);
  }
}	

