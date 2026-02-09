package Mypackage;
import java.util.*;
public class WrapperAssingment {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no");
	int no = sc.nextInt();
	Integer y = new Integer(no);
	System.out.println("Integer value is  "+y);
	Double d = new Double(no);
	System.out.println("Double value is  "+d);
	long l = new Long(no);
	System.out.println("Long value is  "+l);
	sc.close();
	}

}
