package com.xuhu.LeetCode.easy.easyBefore100.easy0026;


class Solution {
    public int removeDuplicates(int[] nums) {
        if(null == nums || nums.length == 0){
            return 0;
        }
        int index = 0;
        /**
         * 这里的思路比较巧妙，index 表示的是，当前符合要求的数组在数组中的下标
         * index 初始为0 也就是说，不管怎么，下标从0 到index（此时也为0，也就是只有第一个数字）肯定是符合要求的
         * 一旦有比nums[index]更大的，也就是不相同的数字，则把index+1的值填充为 这个比nums[index]大的值
         * 可以通过一下数组理解数组中的交换的变化
         * 跟双指针方法意思相同
         * int[] nums = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4};
         */
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[index]){
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }
}