package Mypackage;

import java.util.Scanner;

public class RemoveDuplicates {

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
    int s = 0;
  
    for(int i=0;i<a.length;i++) {
    	if(!(a[i]==a[s]))
    	{
    		System.out.println("the duplicate element is"+a[i]);
    		s++;
    		}
    	
    		
    	else if(a[i]==a[s]){
    		System.out.println("there is no duplicate element ");
    	}
    }
sc.close();
	}

}
