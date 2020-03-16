package com.xuhu.LeetCode.easy.easyBefore800.easy0705;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.contains(3));
        hashSet.add(2);
        System.out.println(hashSet.contains(2));
        hashSet.remove(2);
        System.out.println(hashSet.contains(3));
    }
}