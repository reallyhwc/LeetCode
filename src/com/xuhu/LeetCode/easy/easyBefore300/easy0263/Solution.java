package com.xuhu.LeetCode.easy.easyBefore300.easy0263;


class Solution {
    public boolean isUgly(int num) {
        if(num <= 0){
            return false;
        }
        if(num >= 1 && num <= 6){
            return true;
        }
        while (num % 10 == 0){
            num /= 10;
        }
        while (num % 5 == 0){
            num /= 5;
        }
        while (num % 3 == 0){
            num /= 3;
        }
        while (num % 2 == 0){
            num /= 2;
        }
        return num == 1;
    }
}