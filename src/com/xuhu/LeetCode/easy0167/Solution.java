package com.xuhu.LeetCode.easy0167;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if(null == numbers || numbers.length <= 1){
            return result;
        }
        Map map = new HashMap<Integer,Integer>(numbers.length * 4);
        for(int i = 0; i < numbers.length; i++){
            if (map.containsKey(target - numbers[i])){
                int before = (int)map.get(target - numbers[i]);
                result[0] = before + 1;
                result[1] = i + 1;
                return result;
            }else{
                map.put(numbers[i],i);
            }
        }
        return result;
    }
}