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
	//returns preferred index position
	public int hashFunc(String word){
		int hashval = word.hashCode();
		hashval = hashval % arrSize;
		if(hashval < 0){
			hashval += arrSize;
		}
		return hashval;
	}
	//return step size
	public int stepSize(String word){
		int hashval = word.hashCode();
		hashval = hashval % arrSize;
		if(hashval < 0){
			hashval += arrSize;
		}
		return 3 - hashval % 3;
	}
	
	public void insert(String word){
		int hashVal = hashFunc(word);
		int stepSize = stepSize(word);
		
		while(arr[hashVal] != null){
			hashVal = hashVal + stepSize;
			hashVal = hashVal % stepSize;
		}
		arr[hashVal] = word;
		System.out.println("inserted word:" + word);
		size++;
	}
	
	public String find(String word){
		int hashVal = hashFunc(word);
		int stepSize = stepSize(word);
		while(arr[hashVal] != null){
			if(arr[hashVal].equals(word)){
				return arr[hashVal];
			}
			hashVal = hashVal + stepSize;
			hashVal = hashVal % stepSize;
		}
		return arr[hashVal];
	}


	public static void main(String[] args) {
	}

}
