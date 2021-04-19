package com.JDb.compute;

import java.util.HashSet;

public class LeetCode208 {


}

class Trie {

    HashSet<String> m;
    HashSet<String> p;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        m = new HashSet<>(16);
        p = new HashSet<>(256);
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        if (word.length()==0) {
            return;
        }
        m.add(word);
        for (int i = 1; i <= word.length(); i++) {
            p.add(word.substring(0, i));
        }
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        return m.contains(word);
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        return p.contains(prefix);
    }
}

