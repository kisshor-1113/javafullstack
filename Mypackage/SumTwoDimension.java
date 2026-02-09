package Mypackage;

import java.util.Scanner;

public class SumTwoDimension {
    
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no of rows");
			 int rows=sc.nextInt();
			 
			 System.out.println("enter no of columns");
			 int cols = sc.nextInt();
			 
			 int[][] arr = new int [rows][cols];
			 
			System.out.println("enter array elemnts");
	    for(int i = 0;i< rows;i++) {
	    	for(int j = 0;j< cols;j++) {
	    		System.out.println("enter the elemnts:"+i);
	 	   arr[i][j] = sc.nextInt();   
	    }
	   }
	    
	    
	    for(int i = 0;i< rows;i++) {
	    	int sum = 0;
	    	for(int j = 0;j< cols;j++) {
	 	   sum += arr[i][j];
	    	}
	 	   System.out.println("Sum of row " + (i + 1) + " = " + sum);   
	    }
	   
	   sc.close();

	}

}
