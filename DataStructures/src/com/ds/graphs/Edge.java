package com.ds.graphs;

public class Edge {
	int dest;
	int weight;
	Edge(int dest, int weight){
		this.dest = dest;
		this.weight = weight;
		}
	public String toString() {
		return "dest = "+dest+", weight = "+weight;
	}
}
