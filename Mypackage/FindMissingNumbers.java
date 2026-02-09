package Mypackage;

	import java.util.*;

	public class FindMissingNumbers {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value of n:");
	        int n = sc.nextInt();
	        Set<Integer> inputSet = new HashSet<>();

	        for (int i = 1; i <= n; i++) {
	            System.out.println("Enter value " + i);
	            int num = sc.nextInt();
	            if (num >= 1 && num <= 100) {
	                inputSet.add(num);
	            }
	        }

	        System.out.println("Input set: " + inputSet);
	        System.out.println("Numbers missing in 1–100:");
	        for (int i = 1; i <= 100; i++) {
	            if (!inputSet.contains(i)) {
	                System.out.println(i);
	            }
	            sc.close();
	        }
	    }
	}

	


