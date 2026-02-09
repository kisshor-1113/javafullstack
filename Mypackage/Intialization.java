
   package Mypackage;

import java.util.Scanner;

public class Intialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		 int size=sc.nextInt();
     int[] a = new int [size];
     
 	
		System.out.println("enter "+""+size+"elemnts:");
		
    for(int i=0;i<a.length;i++) {
 	   System.out.println("enter the elemnts:"+i);
 	   a[i] = sc.nextInt();   
    }
     
    for(int i=0;i<a.length;i++) {
    	System.out.println("enter the elemnts:"+a[i]);
    }
	
sc.close();
}
}
