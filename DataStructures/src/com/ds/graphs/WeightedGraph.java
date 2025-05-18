package com.ds.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraph {
	
	Map<Integer, List<Edge>> adjList;
	
	WeightedGraph(){
		adjList = new HashMap<>();
	}
	
	public void addVertex(int v) {
		adjList.putIfAbsent(v, new ArrayList<>());
	}
	
	public void addEdge(int src, int dest, int weight, boolean isDirected) {
		 
		adjList.putIfAbsent(src, new ArrayList<>());
		adjList.putIfAbsent(dest, new ArrayList<>());
		adjList.get(src).add(new Edge(dest,weight));
		if(!isDirected) {
			adjList.get(dest).add(new Edge(src,weight));
		}
	}
	
	public void printGraph() {
		for(Integer v : adjList.keySet()) {
			System.out.print(v+" : ");
			for(Edge edge : adjList.get(v)) {
				System.out.print(edge+" ");
			}
			System.out.println();
		}
	}

}
