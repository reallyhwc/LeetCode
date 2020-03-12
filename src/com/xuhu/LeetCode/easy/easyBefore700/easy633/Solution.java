package com.xuhu.LeetCode.easy.easyBefore700.easy633;


class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int)Math.sqrt(c);
        while (i <= j){
            int total = i * i + j * j;
            if(total < c){
                i++;
            }else if(total > c){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }
}