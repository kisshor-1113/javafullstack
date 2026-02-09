package DSA;

public class BinarySearchExample {

	//Returns index of target if found, else -1
	static int binarySearch(int[] arr, int target) {
		int left= 0 , right = arr.length-1;
		
	while(left<= right) {
		int mid = left + (right-left) / 2;//avoid overflow
		
		if(arr[mid]  == target)
			return mid;
		else if(arr[mid] < target)
			left = mid + 1;
		else
			right = mid - 1;
	}
	return -1;
	
	}
	
	public static void main(String[] args) {
		int[] arr = {2,5,12,16,23,38,56,72,91};
		int target = 23;
		
		int result = binarySearch(arr, target);
		if(result == -1)
			System.out.println("Element found");
		else
			System.out.println("Element not found"+result);

	}

}
