package com.trie;

public class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		TrieNode node = root;
		for(int i = 0;i < word.length();i++) {
			char currentChar = word.charAt(i);
			if(!node.containsKey(currentChar)) {
				node.put(currentChar, new TrieNode());
			}
			node = node.get(currentChar);
		}
		node.setEnd();
	}
	
	
	private TrieNode searchPrefix(String word) {
		TrieNode node = root;
		for(int i = 0;i < word.length();i++) {
			char currentChar = word.charAt(i);
			if(node.containsKey(currentChar)) {
				node = node.get(currentChar);
			}
			else {
				return null;
			}
		}	
		return node;
	}
	
	public boolean search(String word) {
		TrieNode node = searchPrefix(word);
		return (node != null && node.isEnd());
	}
	
	public boolean startsWith(String word) {
		TrieNode node = searchPrefix(word);
		return (node != null);
	}
}
