package Mypackage;

import java.util.Scanner;

public class Equalization {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		 int size=sc.nextInt();
		 int size1 = sc.nextInt();
		 int[] a = new int [size];
		System.out.println("enter "+""+size+"elemnts:");
		int[] arr = new int[size1];
		System.out.println("enter "+""+size1+"elemnts:");
		
    for(int i=0;i<a.length;i++) {
 	   System.out.println("enter the elemnts:"+i);
 	   a[i] = sc.nextInt();   
    }
    
    for(int i=0;i<arr.length;i++) {
  	   System.out.println("enter the elemnts:"+i);
  	   arr[i] = sc.nextInt();   
     }
    System.out.println(arrayEquals(a,arr));
    sc.close();
    }
    public static boolean arrayEquals(int[]a,int[]arr) {
    	if(a.length!= arr.length) {
    		return false;
    	}
    	for(int i = 0;i < a.length;i++) {
    		if(a[i]!=arr[i]) {
    			return false;
    		}
    		
    	}
    	return true;
    	
    }

	}


