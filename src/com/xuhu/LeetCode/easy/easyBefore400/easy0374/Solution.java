package com.xuhu.LeetCode.easy.easyBefore400.easy0374;


/*
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left < right){
            int mid = left + (right - left) / 2;
            int num = guess(mid);
            if(num == 0){
                return mid;
            }else if(num == -1){
                right = mid - 1;
            }else if(num == 1){
                left = mid + 1;
            }
        }
        return left;
    }
}*/
