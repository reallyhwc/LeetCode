package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D02;


import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<> ();
        for (int nums : nums1){
            set1.add(nums);
        }
        for (int nums : nums2) {
            if (set1.contains(nums)){
                set2.add(nums);
            }
        }
        int[] ans = new int[set2.size()];
        AtomicInteger index = new AtomicInteger();
        set2.stream().forEach(integer -> {
            ans[index.getAndIncrement()] = integer;
        });
        return ans;
    }
}