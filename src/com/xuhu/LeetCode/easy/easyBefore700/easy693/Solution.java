package com.xuhu.LeetCode.easy.easyBefore700.easy693;


class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean isOne = (n&1) == 1;
        n >>= 1;
        while (n > 0){
            if(isOne == ((n&1) == 1)){
                return false;
            }else {
                isOne = !isOne;
            }
            n >>= 1;
        }
        return true;
    }
}