package com.trie;

public class TrieApplication {
	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("datastructure");
		System.out.println("Is word - \'datastructure\' present in trie?  :"+ t.search("datastructure"));
		System.out.println("Is word - \'data present\' in trie?  :"+ t.search("data"));
		System.out.println("Is there a word in trie that starts with \'data\'?  :"+ t.startsWith("data"));
	}
}
