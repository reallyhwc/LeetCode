package com.xuhu.LeetCode.easy0167;


import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * hashmap解法，时间复杂度比较高
     * 循环的去判断当前数的补数（也就是 trget - num【i】 是否存在hashmap中，如果存在则返回）
     * 不存在则把当前数添加进hashmap中去
     * @param numbers 数组
     * @param target 待比较的数
     * @return 符合要求的两个数的下标
     */
    public int[] twoSum2(int[] numbers, int target) {
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

    //双指针两头逼近
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if(null == numbers || numbers.length <= 1){
            return result;
        }
        int i = 0;
        int j = numbers.length - 1;
        while(i < j){
            int sum = numbers[i] + numbers[j];
            if(sum < target){
                i++;
                continue;
            }
            if(sum > target){
                j--;
                continue;
            }
            if(sum == target){
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            }
        }
        return result;
    }
}