package com.graphs;

import java.util.List;

public class Node<T> {
	 T data;
	 State state;
	 List<Node<T>> adjacentNodes;
	
	public Node(T t) {
		this.data = t;
	}

	public T getData() {
		return data;
	}

	public State getState() {
		return state;
	}

	public void setAdjacentNodes(List<Node<T>> adjacentNodes) {
		this.adjacentNodes = adjacentNodes;
	}

	public List<Node<T>> getAdjacentNodes() {
		return adjacentNodes;
	}
		
}
