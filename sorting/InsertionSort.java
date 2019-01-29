package com.samp.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {25,47,3,19,8,18};
		System.out.println(Arrays.toString(insertionSort(arr)));

	}
	//25,47,3,19,8,18
	public static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;++i) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && key < arr[j]) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	
}
