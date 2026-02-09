package Mypackage;
		import java.util.*;

		public class RemoveDuplicate {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the Array Size : ");
		        int size = sc.nextInt();
		        int[] arr = new int[size];
		        for (int i = 0; i < arr.length; i++) {
		            System.out.println("Enter the value of " + (i + 1) + " elemenent ");
		            arr[i] = sc.nextInt();
		        }
		        System.out.println("The Array is ");
		        for (int i : arr) {
		            System.out.println(i);
		        }
		        Set<Integer> arrNew = new HashSet<>();
		        for (int i = 0; i < arr.length; i++) {
		            arrNew.add(arr[i]);
		        }
		        System.out.println("Array After Remove Duplicates is : " + arrNew);
		    sc.close();
		    }
		    
		}

	


