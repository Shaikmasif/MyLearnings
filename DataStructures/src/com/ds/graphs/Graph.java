package com.ds.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Graph {
	Map<Integer, List<Integer>> adjList;
	Graph(){
		adjList = new HashMap<Integer, List<Integer>>();
	}

	public void addEdge(int a, int b) {
		adjList.putIfAbsent(a, new ArrayList<Integer>());
		adjList.putIfAbsent(b, new ArrayList<Integer>());
		adjList.get(a).add(b);
		adjList.get(b).add(a);
		
	}
	public void printGraph() {
		for(Integer a : adjList.keySet()) {
			System.out.print(a+" : ");
			for(int b : adjList.get(a)) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
