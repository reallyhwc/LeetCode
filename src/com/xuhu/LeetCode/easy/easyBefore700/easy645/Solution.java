package com.xuhu.LeetCode.easy.easyBefore700.easy645;


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] array = new int[nums.length + 1];
        for(int num : nums){
            array[num]++;
        }
        int[] result = new int[2];
        for(int i = 1; i < array.length; i++){
            if(array[i] == 1) continue;
            if(array[i] == 2){
                result[0] = i;
            }
            if(array[i] == 0){
                result[1] = i;
            }
        }
        return result;
    }

    public int[] findErrorNums_hashmap(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int mis = -1;
        int dou = -1;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for(int i = 1; i <= nums.length; i++){
            if(map.containsKey(i)){
                if(map.get(i) >= 2){
                    dou = i;
                }
            }else {
                mis = i;
            }
        }
        return new int[]{dou,mis};
    }
}

