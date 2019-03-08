package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pubg {

	public static void main(String[] args) {
		
		char[] arr = {'P','Z', 'P', 'Z', 'Z', 'Z', 'P', 'P', 'P'};
		
		int result =0;
		int range = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'P') {
				int count = 1;
				while (count <= range) {
					if (i+count < arr.length && arr[i+count] == 'Z') {
						arr[i+count] = 'K';
						result++;
						break;
					} else if (arr[i - count] == 'Z' && !(i - count < 0)) {
						arr[i - count] = 'K';
						result++;
						break;
					}
					count++;
				}
			}
		}
		
		System.out.println(result);
		
		
		}
}


