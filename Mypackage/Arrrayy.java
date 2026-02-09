package Mypackage;
import java.util.*;
public class Arrrayy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		//int sum = 0; 
		
		System.out.println("Enter the size");
		size = sc.nextInt();
		int[] a =new int[size];
		
		System.out.println("enter "+""+size+"elemnts:");
		
       for(int i=0;i<a.length;i++) {
    	   System.out.println("enter the elemnts:"+i);
    	   a[i] = sc.nextInt();
       }
         int min=a[0];
       
       for(int i=0;i<a.length;i++) {
       //sum += a[i];
       if(a[i] < min) {
    	min = a[i];//max=45,45>23,>90>45   
       }
    	 
       }
       System.out.println("largest   "+min);
       
    	   
	  // System.out.println("sum  = "+ sum);
	
       sc.close();	}

}
