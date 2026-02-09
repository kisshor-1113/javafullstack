package Mypackage;
import java.util.*;
public class WrapperToPrimitive {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no");
	Integer no = sc.nextInt();
	int result = no ;
	System.out.println("int: "+result);
	float result1 = no ;
	System.out.println("float: "+ result1);
	double result2 = no ;
	System.out.println("double: "+ result2);
	 long  result3= no ;
	System.out.println("long: "+ result3);
	
sc.close();
	}

}
