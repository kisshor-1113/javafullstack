package Mypackage;

		import java.util.*;

		public class FindCommonElements {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the Size of an Array ");
		        int size = sc.nextInt();
		        int[] arr1 = new int[size];
		        int[] arr2 = new int[size];
		        Set<Integer> set = new HashSet<>();
		        Set<Integer> common = new HashSet<>();
		        for (int i = 0; i < arr1.length; i++) {
		            System.out.println("Enter the value of " + (i + 1) + " element of arr1 array");
		            arr1[i] = sc.nextInt();
		            set.add(arr1[i]);
		        }
		        System.out.println("The First Array :");
		        for (int i : arr1) {
		            System.out.println(i);
		        }
		        for (int i = 0; i < arr2.length; i++) {
		            System.out.println("Enter the value of " + (i + 1) + " element of arr2 array");
		            arr2[i] = sc.nextInt();
		        }
		        System.out.println("The Second Array :");
		        for (int i : arr2) {
		            System.out.println(i);
		        }
		        for (int i : arr2) {
		            if (set.contains(i)) {
		                common.add(i);
		            }
		        }
		        System.out.println("The Items of array " + set);
		        System.out.println("The common items of array " + common);
	            sc.close();	   
		    }
		}
	


