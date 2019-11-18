package com.xuhu.LeetCode.easy.easyBefore300.easy0217;

import java.util.HashMap;
import java.util.Map;

class Solution {

    /**
     * hashmap 解法
     * @param nums 数组
     * @return true or false
     */
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        if(null == nums || nums.length <= 1){
            return false;
        }
        for(int X : nums){
            if(map.containsKey(X)){
                return true;
            }else {
                map.put(X,X);
            }
        }
        return false;
    }

    //还有一种解法是 对数组进行排序 然后再再比对 这样时间复杂度会小很多

}