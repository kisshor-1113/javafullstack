package Mypackage;
import java.util.*;
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int num1 = sc.nextInt();
			int square = num1*num1;
			int count = square/10;
			int count2 = square%10;
			
			int total = 0;
			
			if(num1!=0) {
				total = count+count2;
			
				if(total == num1){
					System.out.println("This is a neon number");
				}
				else {
					System.out.println("this is not a neon number");
				}
				sc.close();
			}
			
			}

	}

