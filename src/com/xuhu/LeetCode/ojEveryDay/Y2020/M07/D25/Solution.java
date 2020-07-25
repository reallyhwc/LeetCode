package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D25;


class Solution {
    public int splitArray(int[] nums, int m) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums){
            max = Math.max(max, num);
            sum += num;
        }
        if (len == m){
            return max;
        }
        // 从数学角度上来归纳 子数组的 结果和的最大值 必定落在 max - sum 的区间当中
        // 所以用二分来模拟这个过程 取出mid之后，模拟最大值为mid 的情况对数组进行模拟拆分
        int left = max;
        int right = sum;
        while (left < right){
            int mid = left + ((right - left) >> 1);
            int tempSum = 0;
            // count 表示按照这个划分规则 分出来的数组数 默认不分那就长度为1
            int count = 1;
            for (int num : nums){
                tempSum += num;
                if (tempSum > mid){
                    tempSum = num;
                    count++;
                }
            }
            if (count > m){
                // 说明分出来 组数 的比想象中的要多 那么说明，我们取的mid的值还不够大 提升left 的值
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}