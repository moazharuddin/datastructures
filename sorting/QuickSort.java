package com.samp.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {12,81,74,43,1098,0,8,92,17,754,912,0,6,4};
		quickSort(arr,0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		
		int i=low-1;
		
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}

}
