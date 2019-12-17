package com.xuhu.LeetCode.easy.easyBefore400.easy0367;


class Solution {
    public boolean isPerfectSquare(int num) {
        int letf = 1;
        int right = 46340;
        while (letf <= right){
            int mid = (letf + right) / 2;
            if(mid * mid == num){
                return true;
            }else if(mid * mid > num){
                right = mid - 1;
            }else if(mid * mid < num){
                letf = mid + 1;
            }
        }
        return false;
    }
}