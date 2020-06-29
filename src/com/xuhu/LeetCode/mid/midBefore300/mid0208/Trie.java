package com.xuhu.LeetCode.mid.midBefore300.mid0208;

class Trie {

    private boolean is_string = false;
    private Trie next[] = new Trie[26];

    // 0 表示search 1 表示startsWith
    private static final int[] operation = {0,1};

    /** Initialize your data structure here. */
    public Trie() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie root = this;
        char[] chars = word.toCharArray();
        for (int i = 0; i < word.length(); i++){
            if(root.next[chars[i]-'a'] == null){
                root.next[chars[i]-'a'] = new Trie();
            }
            root = root.next[chars[i]-'a'];
        }
        root.is_string = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return operate(word,operation[0]);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return operate(prefix,operation[1]);
    }

    private boolean operate(String word, int operate){
        Trie root = this;
        char[] chars = word.toCharArray();
        for (int i = 0; i < word.length(); i++){
            if(root.next[chars[i]-'a'] == null){
                return false;
            }
            root = root.next[chars[i]-'a'];
        }
        return operate == operation[1] ? true : root.is_string;
    }
}