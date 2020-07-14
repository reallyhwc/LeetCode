package com.xuhu.LeetCode.mid.midBefore300.mid0275;


class Solution {
    // 相当于寻找数组中最左边的满足条件的值
    public int hIndex(int[] citations) {
        if (null == citations || citations.length == 0){
            return 0;
        }
        int n = citations.length;
        int l = 0;
        int r = citations.length-1;
        while (l <= r){
            int mid = (l + ((r-l)>>1));
            int h = n - mid;
            // 不符合条件，向后逼近
            if (h > citations[mid]){
                l = mid+1;
            }else{
                r = mid - 1;
            }
        }
        return n-l;
    }
}