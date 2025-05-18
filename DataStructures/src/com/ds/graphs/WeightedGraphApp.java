package com.ds.graphs;

public class WeightedGraphApp {
	public static void main(String[] args) {
		WeightedGraph wg = new WeightedGraph();
		wg.addEdge(1, 2, 10, true);
		wg.addEdge(1, 3, 20, true);
		wg.printGraph();
	}

}
