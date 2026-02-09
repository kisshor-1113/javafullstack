package Mypackage;
import java.util.*;
 class Counting{
	 static final int c = 45;
	 static  int count;
	 static void displaycount() {
		 if(count<=c) {
		 System.out.println("The count of members is within the limit  "+""+count);
	 }
		 else {
			 System.out.println("The count of members is exceed the limit  "+""+count);
		 }
 }
 }
public class Staticcs {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the count of memebers");
    int k=sc.nextInt();
    sc.close();
    Counting . count=k;
    Counting.displaycount();
	

	}
  }

