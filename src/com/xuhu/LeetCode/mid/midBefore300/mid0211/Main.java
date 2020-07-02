package com.xuhu.LeetCode.mid.midBefore300.mid0211;

public class Main {
    public static void main(String[] args){

        WordDictionary dictionary = new WordDictionary();

        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");
        System.out.println(dictionary.search("pad")); // -> false
        System.out.println(dictionary.search("bad")); // -> true
        System.out.println(dictionary.search(".ad")); // -> true
        System.out.println(dictionary.search("b..")); // -> true

    }
}