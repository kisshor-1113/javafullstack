package com.dsa;

class con{
	int max=0; int count =0;
	
	public int one(int []nums) {
		
		for(int num:nums) {
			if(num==1) {
				count++;
				max = Math.max(max, count);
			}else {
				count=0;
			}
		}
		return max;
	}
}

public class Consecutives {
	public static void main(String[]a) {
		
	int nums[]= {1,1,0,1,1,1};
	
	 con c = new con();
     System.out.print(c.one(nums));
     
	
}
}
