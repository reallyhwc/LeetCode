package com.xuhu.LeetCode.mid.midBefore300.mid0209;


import java.util.Arrays;

class Solution {

    /**
     * n logN的做法 使用前缀和 再用二分
     * @param s
     * @param nums
     * @return
     */
    public int minSubArrayLen(int s, int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int minnum=Integer.MAX_VALUE;

        int[] sum=new int[n+1];
        for(int i=1;i<=n;i++)//前缀和数组
            sum[i]=nums[i-1]+sum[i-1];
        for(int i=0;i<=n;i++)
        {
            int tar=sum[i]+s;
            int bons=Arrays.binarySearch(sum,tar);//二分搜索目标
            if(bons<0)
                bons=~bons;
            if(bons<=n)
                minnum=Math.min(minnum,bons-i);

        }
        return minnum==Integer.MAX_VALUE?0:minnum;
    }
    /**
     * 试用一下双指针进行夹逼，前后指针之间的和大于等于s即可 再定义一个变量存储前后指针距离差（子数组长度）
     * 这也是时间复杂度比较低的一个算法-题目要求使用N logN的操作有点骚，不太能理解
     * @param s
     * @param nums
     * @return
     */
    public int minSubArrayLen1(int s, int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int length = nums.length;
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int nowSum = nums[0];
        while (j < length){
            if(nowSum >= s){
                while (i < j && (nowSum - nums[i]) >= s){
                    nowSum -= nums[i];
                    i++;
                }
                min = Math.min(min,j-i+1);
            }
            // 阶段性结束，进入下一个流程中
            j++;
            if(j != length){
                nowSum += nums[j];
            }
        }
        return nowSum >= s ? min : 0;
    }
}