package com.samp.linear;

import java.util.HashSet;

public class LinkList {
	private Node head ;
	private Node last ;
	HashSet<Integer> set = new HashSet<>();
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertFirst(int data) {
		if (canBeInserted(data)) {
			
			Node new_node = new Node(data);
			if (head == null) {
				last = new_node;
			}
			new_node.next = head;
			head = new_node;
		}
	}
	
	public boolean canBeInserted(int data) {
		if(set.contains(data)) 
			return false;
		else {
			set.add(data);
			return true;
		}
	}
	
	public void insertLast(int data) {
		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;
		} else {
			last.next = new_node;
			last = new_node;
		}
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		} 
	}
	
	public int deleFirst() {
		int temp = head.data;
		
		if(head.next == null)
			last = null;
		
		head = head.next;
		return temp;
	}

	public static void main(String[] args) {
		LinkList ll = new LinkList();
		
		ll.insertFirst(100);
		ll.insertFirst(90);
		ll.insertFirst(80);
		ll.insertFirst(70);
		
		ll.insertLast(60);
		
		ll.insertFirst(50);
		ll.insertFirst(50);
		
		ll.insertLast(10);
		
		ll.display();

	}

}
