package Mypackage;

import java.util.Scanner;

public class Evenn {

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
    for(int i=0;i<a.length;i++) {
    	if(i%2==0) {
    		System.out.println("the even indices"+a[i]);
    	}
    }
    
    sc.close();
	}

}
