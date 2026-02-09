package Mypackage;
import java.util.*;
public class CheckOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		 int size=sc.nextInt();
     int[] a = new int [size];
     
 	
		System.out.println("enter "+""+size+"elemnts:");
		
    for(int i=0;i<a.length;i++) {
 	   System.out.println("enter the elemnts:"+i);
 	   a[i] = sc.nextInt();   
    }
     int ecount=0;
     int ocount=0;
     for(int i=0;i<a.length;i++) {
     if(a[i]%2==0) {
    	 ecount++;
     }
     else {
    	 ocount++;
     }
	}
     System.out.println("the count of even no"+ecount);
     System.out.println("the count of odd no"+ocount);
     sc.close();
	}
}
