package Mypackage;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		 int size=sc.nextInt();
     int[] a = new int [size];
		System.out.println("enter "+""+size+"elemnts:");
		
    for(int i=0;i<a.length-1;i++) {
 	   System.out.println("enter the elemnts:"+i);
 	   a[i] = sc.nextInt();   
    }
    System.out.println("enter the position to search in array");    
    int pos=sc.nextInt();
  
    for(int i=0;i<a.length;i++) {
    	if(pos!=0) {
    		
    	}
    	pos=a[i];
    	 System.out.println(a[i]);  	
    }
    System.out.println("the position is"+pos);  
    sc.close();
	}

}
