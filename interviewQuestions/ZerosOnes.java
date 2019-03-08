package sample;

import java.util.Arrays;

public class ZerosOnes {

	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,0,1,1,0,0};
		
		int i = 0, j = arr.length-1;
		
		while(i < j) {
			
			while(arr[i] == 0 && i < j)//1
				i++;
			
			while(arr[j] == 1 && i < j)//7
				j--;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
