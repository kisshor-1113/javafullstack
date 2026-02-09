package Mypackage;
import java.util.*;
class Calc{
	static final double pi=3.14;
	static double c;
	 static int r;
	 static void circle(){
		System.out.println( c=pi*r*r);
		 
	}
}
public class PiMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of a circle");
		int s=sc.nextInt();
		sc.close();
     Calc.r=s;
  Calc.circle();

	}

}
