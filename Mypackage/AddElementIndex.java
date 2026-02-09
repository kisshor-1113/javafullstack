package Mypackage;

import java.util.Scanner;

public class AddElementIndex {

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
    System.out.println("enter a element to add in array");    
    int ele=sc.nextInt();
    System.out.println("enter the position "); 
    int ind=sc.nextInt();
    int[] arr=new int[size+1];
    for(int i=0;i<arr.length;i++) {
    	if(i<ind) {
    		arr[i]=a[i];
    }
    	else if(i==ind) {
    		arr[i]=ele;
    	}
    	
    	else if(i>ind) {
         arr[i]=a[i-1];
    	}
    	System.out.println(arr[i]);
    }
    sc.close();
}

}


	

