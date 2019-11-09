package com.xuhu.LeetCode.easy.easyBefore200.easy0088;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //看起来代码很简单-思路上并不难理解
        //第一行的作用就是，把m,n各自减一（得到最后一位的下标）
        //同时 通过这种巧妙地赋值 令i = 合并后的数组的最后一位的下标
        int i = m--+--n;
        //while循环的目的就是获取两个数组中，大的一个填充到返回数组的最后一个
        while(n >= 0){
            nums1[i--] = m >= 0 && nums1[m]>nums2[n] ? nums1[m--] : nums2[n--];
        }
    }
}