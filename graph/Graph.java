package com.samp.graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	private LinkedList adj[];
	private int vCount;
	private int eCount;
	
	public Graph(int v) {
		this.vCount = v;
		this.eCount = 0;
		this.adj = new LinkedList[v];
		for(int i=0;i<v;++i) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
		
		Object[] obj = g.adjMatrix(2);
		System.out.println(Arrays.toString(obj));
		
		g.DFS(2);
		g.BFS(2);
	}
	
	public void DFS(int v) {
		boolean[] visited = new boolean[vCount];
		DFSUtil(v, visited);
	}
	
	public void BFS(int v) {
		boolean[] visited = new boolean[vCount];
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[v] = true;
		queue.add(v);
		while(queue.size() !=0) {
			v = queue.poll();
			System.out.print(v+" ");
			Iterator<Integer> i = adj[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
				
			}
		}
	}


	private void DFSUtil(int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v+" ");
		
		Iterator<Integer> i = adj[v].listIterator();
		
		while(i.hasNext()) {
			int n = i.next();
			if(!visited[n])
				DFSUtil(n, visited);
		}
		
	}

	public void addEdge(int i, int j) {
		adj[i].add(j);
	}
	
	public Object[] adjMatrix(int src) {
		return adj[src].toArray();
	}

}
