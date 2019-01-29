package com.samp.heap;


public class Heap {
	
	private Node[] arr;
	private int maxSize;
	private int currentSize;
	
	public Heap(int size) {
		this.maxSize = size;
		currentSize = 0;
		arr = new Node[size];
	}
	
	public int getSize() {
		return currentSize;
	}
	
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	public boolean insert(int key) {
		if(currentSize == maxSize)
			return false;
		
		Node newNode = new Node(key);
		arr[currentSize] = newNode;
		
		trickleUp(currentSize);
		currentSize++;
		return true;
	}

	private void trickleUp(int n) {
		int findParent = (n - 1)/2;
		Node toInsert = arr[findParent];
		
		while(n > 0 && arr[findParent].getKey() < toInsert.getKey()) {
			arr[n] = arr[findParent];
			n = findParent;
			findParent = (findParent-1)/2;
		}
		arr[findParent] = toInsert;
	}
	
	public Node delete() {
		Node root = arr[0];
		currentSize--;
		arr[0] = arr[currentSize];
		trickleDown(0);
		return root;
	}

	private void trickleDown(int idx) {
		int largerChild;
		Node top = arr[idx];
		
		while(idx < currentSize/2) {
			int left = 2 * idx +1;
			int right = 2 * idx +2;
			
			if(right < currentSize && arr[left].getKey() < arr[right].getKey()) {
				largerChild = right;
			} else {
				largerChild = left;
			}
			if(top.getKey() >= arr[largerChild].getKey())
				break;
			arr[idx] = arr[largerChild];
			idx = largerChild;
		}
		
		arr[idx] = top;
		
	}
	
	public void displayHeap() {
        System.out.println("Heap Array: ");
        for(int m = 0; m < currentSize; m++) {
            if(arr[m] != null) {
                System.out.print( arr[m].getKey() + " ");
            }
            System.out.println();
            
            int nBlanks = 32;
            int itemsPerRow = 1;
            int column = 0;
            int j = 0; // current item
            
            String dots = "...............................";
            System.out.println(dots+dots);
            while(currentSize > 0) {
                if(column == 0) {
                    for(int k = 0; k < nBlanks; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(arr[j].getKey());
                j++;
                if(j == currentSize) {
                    break;
                }
                
                column++;
                // end of row
                if(column == itemsPerRow) {
                    nBlanks = nBlanks/2; // half the blanks
                    itemsPerRow = itemsPerRow * 2;     // twice the items
                    column = 0;
                    System.out.println();
                } else {
                    for(int k=0; k<nBlanks*2; k++) {
                        System.out.print(" ");
                    }
                }
                    
            }
            System.out.println("\n"+dots+dots);
        }
        
        
    }

	public static void main(String[] args) {
		Heap heap = new Heap(7);
		heap.insert(10); 
		heap.insert(4);
		heap.insert(50);
		heap.insert(110);
		heap.insert(13);
		heap.insert(15);
		heap.insert(1132);
		
		heap.displayHeap();
	}
	
	class Node{
		private int key;

		public Node(int key) {
			super();
			this.key = key;
		}

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}
		
	}
	
}
