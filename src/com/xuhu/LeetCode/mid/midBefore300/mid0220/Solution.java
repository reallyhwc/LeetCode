package com.xuhu.LeetCode.mid.midBefore300.mid0220;


import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++){
            // 从 TreeSet中查找出来 set中的第一个比nums[i] 大的值
            Integer s = set.ceiling(nums[i]);
            if (s != null && s <= nums[i] + t){
                return true;
            }
            // 从 TreeSet中查找出来 set中的第一个比nums[i] 小的值
            Integer g = set.floor(nums[i]);
            if(g != null && nums[i] <= g + t){
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}