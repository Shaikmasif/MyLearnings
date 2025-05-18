package com.ds.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedGraph {
	Map<Integer, List<Integer>> adjList;
	
	DirectedGraph(){
		adjList = new HashMap<Integer, List<Integer>>();
	}
	
	public void addEdge(int from, int to) {
		adjList.putIfAbsent(from, new ArrayList<Integer>());
		adjList.putIfAbsent(to, new ArrayList<Integer>());
		adjList.get(from).add(to);
	}
	
	public void printGraph() {
		for(Integer i : adjList.keySet()) {
			System.out.print(i+" : ");
			for(Integer j : adjList.get(i)) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
