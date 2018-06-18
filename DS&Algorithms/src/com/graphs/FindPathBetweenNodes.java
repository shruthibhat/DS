package com.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @author shruthi
 * 
 * Graph problem
 * 
 * Given a directed graph, design an algorithm to find out whether there is an route between two nodes.
 * 
 *   A --> B -->  E
 *   |		      ^
 *   |		     /
 *   |		    /
 *   |--> D --> C
 *   
 *   
 *
 */
public class FindPathBetweenNodes {

	public static void main(String[] args) {
		//Create individual nodes
		Node<Character> A = new Node<Character>('A');
		Node<Character> B = new Node<Character>('B');
		Node<Character> C = new Node<Character>('C');
		Node<Character> D = new Node<Character>('D');
		Node<Character> E = new Node<Character>('E');

		//Add adjacency list to each node
		List<Node<Character>> neighboursOfA = new ArrayList<Node<Character>>();
		neighboursOfA.add(B);
		neighboursOfA.add(D);

		List<Node<Character>> neighboursOfB = new ArrayList<Node<Character>>();
		neighboursOfB.add(E);

		List<Node<Character>> neighboursOfC = new ArrayList<Node<Character>>();
		neighboursOfC.add(E);


		List<Node<Character>> neighboursOfD = new ArrayList<Node<Character>>();
		neighboursOfD.add(C);

		A.setAdjacentNodes(neighboursOfA);
		B.setAdjacentNodes(neighboursOfB);
		C.setAdjacentNodes(neighboursOfC);
		D.setAdjacentNodes(neighboursOfD);

		//Add all nodes to the graph object
		List<Node<Character>> nodesinGraph = new ArrayList<Node<Character>>();
		nodesinGraph.add(A);
		nodesinGraph.add(B);
		nodesinGraph.add(C);
		nodesinGraph.add(D);
		nodesinGraph.add(E);

		Graph<Character> graph = new Graph<Character>(nodesinGraph);

		System.out.println("If there is a path from Node A to Node E?:" + search(graph,A,E));
		System.out.println("If there is a path from Node E to Node A?:" + search(graph,E,A));

	}

	static boolean search(Graph<Character> g, Node<Character> s, Node<Character> e) {

		if(s == e) {
			return true;
		}

		Queue<Node<Character>> q = new LinkedList<Node<Character>>();

		for(Node<Character> u: g.getNodes()) {
			u.state = State.UNVISITED;				
		}

		s.state = State.VISITING;
		q.add(s);

		Node<Character> temp;
		while(!q.isEmpty()) {
			temp = q.poll();
			if(temp != null) {
				if(temp.getAdjacentNodes() != null) {
					for( Node<Character> v: temp.getAdjacentNodes()) {
						if(v.state == State.UNVISITED) {
							if(v == e) {
								return true;
							}
							else {
								v.state = State.VISITING;
								q.add(v);
							}
						}
					}
				}
				temp.state = State.VISITED;			
			}
		}

		return false;
	}

}
