package com.xuhu.LeetCode.easyBefore200.easy0009;


class Solution {
    public boolean isPalindrome(int x){
        int a = x;
        /**
         * 非字符串解法，也比较简单吧，通过0007里面的，把数字顺序转换一下即可，然后再判断是否相等就行了
         */
        if(x < 0){
            return false;
        }
        if(x < 10){
            return true;
        }
        int rs = 0;
        while (x > 0){
            rs = rs * 10 + x%10;
            x /= 10;
        }
        return rs == a;
    }

    public boolean isPalindrome01(int x) {
        /**
         * 转换成字符串的解法：
         * 转换成字符串，然后用下标两头掐一下，出现异常就返回false，一直到最后都没有异常则返回true
         */
        if(x < 0){
            return false;
        }
        String str = Integer.toString(x);
        int length = str.length();
        for(int i = 0; i < (length / 2); i++){
            if(str.charAt(i) != str.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }
}