package com.xuhu.LeetCode.easy.easyBefore300.easy0231;


class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1 || n == 2){
            return true;
        }
        while (n % 2 == 0){
            n = n / 2;
        }
        return n==1;
    }

    /**
     * 第二种解法，不过看不懂
     * @param n n
     * @return 是否
     */
    public boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}