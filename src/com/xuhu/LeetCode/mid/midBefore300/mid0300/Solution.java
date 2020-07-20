package com.xuhu.LeetCode.mid.midBefore300.mid0300;


import java.util.Arrays;

class Solution {


    /**
     * 相当于维护一个结果数组，如果当前元素比结果数组的值都大的的话，
     * 就追加在结果数组后面（相当于递增序列长度加了1）；
     * 否则的话用当前元素覆盖掉第一个比它大的元素
     * （这样做的话后续递增序列才有可能更长，
     * 即使并没有更长，这个覆盖操作也并没有副作用哈，
     * 当然这个覆盖操作可能会让最终的结果数组值并不是最终的递增序列值，这无所谓）
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums) {
        int[] result = new int[nums.length];
        int len = 0;
        for (int num : nums){
            // 调用系统二分搜索函数 来判断当前nums是否处于当前维护的结果数组
            int idx = Arrays.binarySearch(result,0,len,num);
            idx = idx < 0 ? -idx - 1 : idx;
            // 如果比当前最大的数都要大，那么就添加到数组中去
            // 否则的话，就用当前元素覆盖掉第一个比它大的元素
            result[idx] = num;
            if (idx == len){
                len++;
            }
        }
        return len;
    }

    /**
     * ok   既然这里说到了使用dp   那就采取经典递归的思路
     * @param nums
     * @return
     */
    public int lengthOfLIS1(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length+1];
        // dp[i] 表示到数组第I位结尾 可以得到的最长上升子序列的长度
        Arrays.fill(dp, 1);

        for (int i = 1; i < nums.length; i++){
            for (int j = i-1; j >= 0; j--){
                if (nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int num : dp){
            max = Math.max(max,num);
        }
        return max;
    }
}