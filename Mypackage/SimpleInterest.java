package Mypackage;
import java.util.*;
  class Interest{
	   static final float fi=45.1f;
	  static int p;
	  static  int t; 
	  static float si;
	  static void display() {
		System.out.println(si=(p*fi*t)/100);
	  }
  }
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for principle");
		int p1=sc.nextInt();
		System.out.println("Enter the value for time");
		int t1=sc.nextInt();
		sc.close();
	Interest.p=p1;
	Interest.t=t1;
	Interest.display();
	
		
	}

}
