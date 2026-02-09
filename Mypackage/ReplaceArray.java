package Mypackage;

import java.util.Scanner;

public class ReplaceArray {

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
    System.out.println("enter the element to replace");
    int oldValue = sc.nextInt();
    
    System.out.println("enter the new element ");
    int newValue = sc.nextInt();
    
    for(int i= 0; i < a.length;i++) {
    	if(a[i]==oldValue){
    		a[i] = newValue;
    		break;
    	}
    }
    
    System.out.println("Replaced Element");
     for(int x:a) {
    	 System.out.print(x);
     }
     sc.close();
	}
}
