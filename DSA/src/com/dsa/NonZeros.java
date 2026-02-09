package com.dsa;

class Non{
	int index=0;
	public void Zero(int[]nums) {
		for(int num:nums) {
			if(num!=0) {
				nums[index++]=num;
			}
		}
		
		while(index<nums.length) {
			nums[index++]=0;
		}
	}

}
public class NonZeros {

	public static void main(String[]args) {
		
		int number[] = {0,1,0,3,12};
		Non n = new Non();
		n.Zero(number);
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
		
	}
}
	

