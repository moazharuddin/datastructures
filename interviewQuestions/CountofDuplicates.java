package com.samp.interv;


public class CountofDuplicates {
	
	static final int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		
		String s = "Azharuddin";
		
		printDups(s); // Print Count of charactes in String
	}

	private static void printDups(String s) {
		int[] chars = new int[NO_OF_CHARS];
		fillChars(s,chars);
		
		for(int i=0;i<NO_OF_CHARS;i++) {
			if(chars[i]>0)
			System.out.printf("%c - %d\n", i, chars[i]);
		}
		
	}

	private static void fillChars(String s, int[] chars) {
		for(int i=0;i<s.length();i++) {
			chars[s.charAt(i)]++;
		}
	}

}
