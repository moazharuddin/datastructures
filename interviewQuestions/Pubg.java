package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pubg {

	public static void main(String[] args) {
		
		char[] arr = {'P','Z', 'P', 'Z', 'Z', 'Z', 'P', 'P', 'P'};
		
		
		List<Long> ll = new ArrayList<Long>();
		Long n=10L;
		
		ll.add(33L);
		ll.add(44L);
		
		System.out.println(ll.stream().filter(x -> {
			Long xx = 44L;
			return x.equals(xx);
			}).collect(Collectors.toList()));
		
		
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


