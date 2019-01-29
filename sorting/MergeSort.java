package com.samp.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,81,74,43,1098,0,8,92,17,754,912,0,6,4};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int[] arr, int l, int h) {
		if(h<=l)
			return;
		 
			int p = (l+h)/2;
			mergeSort(arr, l, p);
			mergeSort(arr, p+1, h);
			merge(arr,l,p,h);
	}

	public static void merge(int[] arr, int l, int p, int h) {
		int left = p-l +1;
		int right = h-p;
		
		int[] L = new int[left];
		int[] R = new int[right];
		
		for(int i=0;i<left;i++) {
			L[i] = arr[l+i];
		}
		for(int i=0;i<right;i++) {
			R[i] = arr[p+1+i];
		}
		
		int i=0, j=0, k =l;
		
		while(i<left&&j<right) {
			if(L[i]<=R[j])
				arr[k]=L[i++];
			else
				arr[k]=R[j++];
			k++;
		}
		
		while(i<left) {
			arr[k++] = L[i++];
		}
		
		while(j<right) {
			arr[k++] = R[j++];
		}
		
	}

}
