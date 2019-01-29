package com.samp.linear;

public class LinearSearch {
	
	int linearSearch(int[] arr, int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key)
				return i;
		}
		
		return -1;
	}
	
	public static int bst(int[] arr, int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int pivot = (low + high)/2;
			if(arr[pivot] == key)
				return pivot;
			else if(arr[pivot] > key) {
				high = pivot - 1;
				
			}else if(arr[pivot] < key) {
				low = pivot + 1;
				
			}
		}
		return -1; 
	}
	
	public static int recurseBst(int[] arr,int l, int h, int key) {
		if(l>h)
		return -1;
			
		int pivot = (l+h)/2;
		if(arr[pivot]==key) return pivot;
		else if(arr[pivot] > key) return recurseBst(arr, l, pivot-1, key);
		else return recurseBst(arr, pivot+1, h, key);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,2,3,4,7,9,12,18};
		System.out.println(recurseBst(arr,0,arr.length-1,12));
	}

}
