package com.ds.graphs;

public class DirectedGraphApp {
	
	public static void main(String []args) {
		DirectedGraph dg = new DirectedGraph();
		dg.addEdge(1, 2);
		dg.addEdge(1, 3);
		dg.printGraph();
	}

}
