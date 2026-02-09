package Mypackage;

import java.util.Scanner;

public class RemoveSpecificElement {

	
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
	    System.out.println("enter the element to remove");
	    int ele=sc.nextInt();
	    int []temp = new int[size];
	    for(int i=0;i<a.length;i++) {
	    	if(ele==a[i]) {
	    		System.out.println("");
	    		
	    	}
	    	else {
	    		temp[i] = a[i];
	    		System.out.println(a[i]);
	    	}
	    }
	    sc.close();
	}

}
