package com.xuhu.LeetCode.mid.midBefore300.mid0211;



class WordDictionary {

    /**
     * 整体上设计思路参考T208 字典树的数据结构设计  一层仅存储一个字母 使用  .  的时候就使用for循环层序search（回溯）
     */

    private WordDictionary[] next = new WordDictionary[26];
    private boolean is_end = false;

    /** Initialize your data structure here. */
    public WordDictionary() {

    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        WordDictionary dictionary = this;
        char[] chars = word.toCharArray();
        for (int i = 0; i < word.length(); i++){
            if(dictionary.next[chars[i]-'a'] == null){
                dictionary.next[chars[i]-'a'] = new WordDictionary();
            }
            dictionary = dictionary.next[chars[i]-'a'];
        }
        dictionary.is_end = true;
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        if(word == null || word.length() == 0){
            return this.is_end;
        }
        String nowStr = word.substring(1);
        char c = word.charAt(0);
        if('.' == c){
            for (int i = 0; i < 26; i++){
                if(this.next[i] != null && this.next[i].search(nowStr)){
                    return true;
                }
            }
            return false;
        }
        if (this.next[c-'a'] != null){
            return this.next[c-'a'].search(nowStr);
        }else {
            return false;
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */