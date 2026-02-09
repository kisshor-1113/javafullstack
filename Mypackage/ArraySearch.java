package Mypackage;

import java.util.Scanner;

public class ArraySearch {

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
    System.out.println("enter the elemnts to search");
     int key=sc.nextInt();
     
     int flag = 0;
     for(int i = 0; i < size;i++) {
    	 if(a[i]==key) {
    		 flag=1;
    		 break;
    	 }
     }
     
     if(flag==1) {
    	 System.out.println("element found in the array");
     }
     else {
    	 System.out.println("element not  found in the array"); 
     }
	sc.close();
	}
}
