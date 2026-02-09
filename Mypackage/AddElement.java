package Mypackage;

import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
	 {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size");
				 int size=sc.nextInt();
		     int[] a = new int [size+1];
				System.out.println("enter "+""+size+"elemnts:");
				
		    for(int i=0;i<a.length-1;i++) {
		 	   System.out.println("enter the elemnts:"+i);
		 	   a[i] = sc.nextInt();   
		    }
		    System.out.println("enter a element to add in array");    
		    int ele=sc.nextInt();
		    System.out.println("entered new element is"+ele);    
		    for(int i=0;i<a.length;i++) {
		    	if(i!=a.length-1) {
		    		
		    		 System.out.println(a[i]);
		    	
		    }
		    	else {
		    System.out.println(a[i]+ele);
		    	}
		    }
		    sc.close();
	 }
	}
}


