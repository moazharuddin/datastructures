package com.samp.interv;

import java.util.Arrays;

public class CompressNumbers {
	//remove duplicates in an Array
	public static int removeDuplicates(int[] nums) {
        int b = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]) {
            	nums[b++] = nums[i];
            }
        }
        nums[b++] = nums[nums.length-1];
       return b;
        
	}
	//Return Sum of two numbers
	public static int[] twoSum(int[] nums, int target) {
	       int m =0, n=0;
	        for(int i=0;i<nums.length;i++){
	            for(int j=0;j<nums.length;j++){
	                if((nums[i]+nums[j])==target){
	                    n = i;
	                    m = j;
	                    break;
	                }
	            }
	        }
	        
	        return new int[]{m,n};
	    }

	public static void main(String[] args) {
		//int[] arr = {1,2,3,4,5,6,8,10,11,12,13,15};
		int[] arr = {4,7,5};
		System.out.println(Arrays.toString(twoSum(arr, 12)));
	}
	
	//Compress numbers like 1-4,6,8..
	public void compressNumbers(int[] arr) {
		int len = arr.length;
        int idx = 0, idx2 = 0;
        while (idx < len) {
            while (++idx2 < len 
            		&& arr[idx2] - arr[idx2 - 1] == 1);
            if (idx2 - idx > 1) {
                System.out.printf("%s-%s,", arr[idx], arr[idx2 - 1]);
                idx = idx2;
            } else {
                for (; idx < idx2; idx++)
                    System.out.printf("%s,", arr[idx]);
            }
        }
	}
	
}
