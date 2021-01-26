package com.ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph {
	ArrayList<ArrayList<Integer>> graph;
	int V;

	Graph(int vertices){
		this.V = vertices;
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<V; i++)
			graph.add(new ArrayList<Integer>());
	}
	
	public void addEdge(int u, int v) {
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	public void print() {
		for(int i=0;i<V;i++) {
			System.out.print("Vertex "+i+": -> ");
			for(int elem: graph.get(i))
				System.out.print(elem+" ");
			System.out.println();
		}
	}
	
	public void bfs(int start) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visited[]  = new boolean[V];
		q.add(start);
		
		while(q.isEmpty() == false) {
			int vertex = q.poll();
			if(visited[vertex] == false) {
				System.out.print(vertex+" ");
				visited[vertex] = true;
				
				for(int elem: graph.get(vertex)) {
					q.add(elem);
				}
			}
		}
	}
	
public void dfs(int start) {
		
		Stack<Integer> stack = new Stack<Integer>();
		boolean visited[]  = new boolean[V];
		stack.push(start);
		
		while(stack.isEmpty() == false) {
			int vertex = stack.pop();
			if(visited[vertex] == false) {
				System.out.print(vertex+" ");
				visited[vertex] = true;
				
				for(int elem: graph.get(vertex)) {
					stack.push(elem);
				}
			}
		}
	}
	
}

public class GraphTestApp {
	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(4, 2);
		g.addEdge(4, 3);

		g.addEdge(4, 1);
		g.addEdge(0, 2);
		g.addEdge(2, 3);
		//g.bfs(1);
		g.dfs(1);
	}
}
