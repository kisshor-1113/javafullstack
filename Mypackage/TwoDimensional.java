package Mypackage;

import java.util.Scanner;

public class TwoDimensional {//2D

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
    
    System.out.println("2D array");
    
    for(int i = 0;i< rows;i++) {
    	for(int j = 0;j< cols;j++) {
 	   System.out.print(arr[i][j] +" ");
    	}
 	   System.out.println();   
    }
   
   sc.close();

	}

}
