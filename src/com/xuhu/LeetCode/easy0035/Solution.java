package com.xuhu.LeetCode.easy0035;

class Solution {
    public int searchInsert(int[] nums, int target) {
        //思路较为简单
        //如果数组为空or数组长度为0 那么等同于往空数组中新增一个数 返回下标为0
        if(null == nums || nums.length == 0){
            return 0;
        }
        int result = 0;
        //用for循环判断遍历，一旦在数组中出现了第一个，不比target小的数，则把下标返回来
        //不比target小 1 相同，返回下标，正确 2 比target大，则插入此数，num[i]
        //所表示的数则往后移一个，当前下标作为顺序插入的数的下标

        //如一直到最后都没有返回 则等同与插入到数组的最后一个，返回length
        for(int i = 0; i < nums.length; i++){
            if(target > nums[i]){
                continue;
            }else{
                return i;
            }
        }
        return nums.length;
    }
}