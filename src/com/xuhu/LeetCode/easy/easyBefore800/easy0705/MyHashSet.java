package com.xuhu.LeetCode.easy.easyBefore800.easy0705;

/**
 * @author xuhu
 * @date 2020-03-16 20:43
 */
class MyHashSet {

    boolean[] map = new boolean[1000005];
    /** Initialize your data structure here. */
    public MyHashSet() {

    }

    public void add(int key) {
        map[key] = true;
    }

    public void remove(int key) {
        map[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return map[key] == true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */