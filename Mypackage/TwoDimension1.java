package Mypackage;
import java.util.*;
public class TwoDimension1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of rows ");
		int rows=sc.nextInt();
		System.out.println("Enter no of cols ");
		int cols=sc.nextInt();
       
		int [][] arr=new int [rows][cols];
		
		System.out.println("Enter no of elements ");
		for(int i = 0; i< rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.println("Entered elements are ");
				arr[i][j] = sc.nextInt();
			}
		}
	

		
		sc.close();
	}

}
