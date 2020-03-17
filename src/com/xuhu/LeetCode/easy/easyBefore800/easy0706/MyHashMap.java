package com.xuhu.LeetCode.easy.easyBefore800.easy0706;

/**
 * @author xuhu
 * @date 2020-03-17 9:29
 */
class MyHashMap {
     int[] nums;
    /** Initialize your data structure here. */
    public MyHashMap() {
        nums = new int[1000005];
        for(int i = 0; i < nums.length; i++){
            nums[i] = -1;
        }
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        nums[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return nums[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        nums[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */