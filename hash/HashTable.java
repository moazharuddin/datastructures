package com.samp.hash;

public class HashTable {
	
	String[] arr;
	int arrSize;
	int size =0;
	
	public HashTable(int slots) {
		if(isPrime(slots)) {
			arrSize = slots;
			arr = new String[slots];
		} else {
			int prime = getNextPrime(slots);
			arr = new String[prime];
			arrSize = prime;
		}
	}
	

	private int getNextPrime(int slots) {
		for(int i=slots;true;i++) {
			if(isPrime(i))
				return i;
		}
	}


	private boolean isPrime(int slots) {
		for(int i=2; i*i <= slots;i++) {
			if(slots % i == 0)
				return false;
		}
		return true;
	}


	public static void main(String[] args) {
	}

}
