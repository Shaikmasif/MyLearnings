package com.ds.graphs;

public class GraphApp {

	public static void main(String []args) {
		Graph graph = new Graph();
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		
		graph.printGraph();
	}
}
