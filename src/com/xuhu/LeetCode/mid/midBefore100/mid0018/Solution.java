package com.xuhu.LeetCode.mid.midBefore100.mid0018;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    //四数之和，采用双循环+双指针逼近
    public List<List<Integer>> fourSum(int[] nums, int target) {

        // 定义返回List
        List<List<Integer>> result = new ArrayList<>();

        // 如果数组长度不到4，则返回空数组
        if(null == nums || nums.length < 4){
            return result;
        }

        // 首先对数组进行排序
        Arrays.sort(nums);

        int length = nums.length;
        //因为是需要找出来与目标值相同的数组中的4项，且已经对数组排过序了
        // 那么直接求出最小最大值 如果最小的值都比目标值大or最大的值都比目标值小，直接返回避免无意义判断
        int minValue = nums[0] + nums[1] + nums[2] + nums[3];
        int maxValue = nums[length-1] + nums[length-2] + nums[length-3] + nums[length-4];
        if(minValue > target || maxValue < target){
            return result;
        }
        // 双循环 目的是首先确定下来两个值
        for(int i = 0; i < length - 3; i++){
            //去重
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i + 1; j < length - 2; j++){
                //去重
                if(j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }
                //定义双指针 向中间移动
                int left = j + 1;
                int right = length - 1;
                //把最大最小值设定成当前循环中可能出现的最大最小值
                minValue = nums[i] + nums[j] + nums[left] + nums[left + 1];
                maxValue = nums[i] + nums[j] + nums[right] + nums[right - 1];
                // 同理，如果超出限制，直接结束当前循环（在i j 值确定的情况下的单词循环。不需要直接return）
                if(minValue > target || maxValue < target){
                    continue;
                }

                //双指针向中间移动
                while (left < right){
                    //定义当前四数之和（i j 确定 前后指针位置可移动）
                    int temp = nums[left] + nums[right] + nums[i] + nums[j];
                    //如果相同，则加入到返回值中去
                    if(temp == target){
                        List<Integer> l = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        result.add(l);
                        //去重
                        while (left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        //去重
                        while (left < right && nums[right] == nums[right - 1]){
                            right--;
                        }
                        left++;
                        right--;
                    }else if(temp > target){
                        right--;
                    }else {
                        left++;
                    }

                }

            }
        }
        return  result;
    }
}