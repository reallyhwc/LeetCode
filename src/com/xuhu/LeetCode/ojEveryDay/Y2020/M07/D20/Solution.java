package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D20;


class Solution {
    /**
     * 双指针夹逼即可，对于有序数组，无需双层for循环也无需hashmap
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0){
            return numbers;
        }
        int i = 0;
        int j = numbers.length-1;
        while (i < j){
            int nowSum = numbers[i] + numbers[j];
            if (nowSum == target){
                return new int[]{i+1,j+1};
            }
            if (nowSum > target){
                j--;
            }else {
                i++;
            }
        }
        return new int[]{};
    }
}