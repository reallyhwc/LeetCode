package com.xuhu.LeetCode.easy.easyBefore300.easy0219;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
         if(null == nums || nums.length <= 0){
             return false;
         }
         for(int i = 0; i < nums.length; i++){
             if(map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)){
                 return true;
             }
             map.put(nums[i],i);
         }
         return false;

    }
}