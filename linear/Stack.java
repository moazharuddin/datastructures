package com.samp.linear;

public class Stack {
	
	private int maxSize;
	private int top;
	private int[] arr;
	
	public Stack(int size) {
		this.maxSize = size;
		this.top = -1;
		this.arr = new int[maxSize];
	}
	
	public void push(int data) {
		arr[top++] = data;
	}
	
	public int pop() {
		int old = top;
		top--;
		return arr[old];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
