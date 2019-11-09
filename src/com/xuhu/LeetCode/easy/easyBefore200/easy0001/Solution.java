package com.xuhu.LeetCode.easy.easyBefore200.easy0001;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        int length = nums.length;
        int[] result = new int[2];
        for(int i = 0; i < length; i++){
            int temp = target - nums[i];
            //如果map中存在目标值和当前值的差值
            //即，如果target为9，nums[i] = 2 去判断map中是否存在key为7的数据
            //如果有，则填充进返回值，如果没有，把nums[i]填充进map，并对下一个数据进行比对
            if(map.containsKey(temp)){
                result[0] = map.get(temp);
                result[1] = i;
                return result;
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}