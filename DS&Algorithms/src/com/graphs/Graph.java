package com.graphs;

import java.util.List;

public class Graph<T> {
	List<Node<T>> nodes;
	
	public Graph(List<Node<T>> n)
	{
		this.nodes = n;
	}
	
	public List<Node<T>> getNodes(){
		return nodes;
	}
}
