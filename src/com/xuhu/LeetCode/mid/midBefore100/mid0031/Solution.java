package com.xuhu.LeetCode.mid.midBefore100.mid0031;



import java.util.Arrays;

class Solution {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        //如果从后往前是递增的
        while (i >= 0 && nums[i+1] <= nums[i]){
            i--;
        }
        if(i >= 0){
            int j = nums.length - 1;
            //从后往前，找出恰好大于nums[i]的一个 nums[j]
            while (j >= 0 && nums[j] <= nums[i]){
                j--;
            }
            //交换 i j
            swap(nums,i,j);
        }
        //对于 i 后面的元素进行颠倒
        reverse(nums, i+1);
    }

    private void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length - 1;
        while (i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //历史代码保留一下，思路一般，仅能
//    public void nextPermutation(int[] nums) {
//        if(null == nums || nums.length <= 1)return;
//
//        int minBigger = Integer.MAX_VALUE;
//        int index1 = -1;
//        int index2 = -1;
//        int length = nums.length;
//        for(int i = length - 1; i > 0; i--){
//            for(int j = i - 1; j >= 0; j--){
//                //计算转换后比转换前多了多少
////                int differ = (((10^(length-j-1))*(nums[i]-nums[j])) + ((10^(length-i-1))*(nums[j]-nums[i])));
//                int differ = (int)Math.pow(10,(length-j-1)) * (nums[i]-nums[j]) + (int)Math.pow(10,(length-i-1)) * (nums[j]-nums[i]);
//                if(differ > 0 && differ < minBigger){
//                    minBigger = differ;
//                    index1 = i;
//                    index2 = j;
//                }
//            }
//        }
//        if(minBigger == Integer.MAX_VALUE){
//            Arrays.sort(nums);
//        }else {
//            int temp = nums[index1];
//            nums[index1] = nums[index2];
//            nums[index2] = temp;
//        }
//    }
}