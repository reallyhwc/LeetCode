package com.xuhu.LeetCode.easy.easyBefore200.easy0125;

class Solution {
    //这里有点懒得优化了...
    //首先把原来的字符串转换成只包含字母和数字的，且字母统统转换成小写字母
    //然后再调用方法判断是否为回文串
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if((c <= 'z' && c >= 'a') || (c <= '9' && c >= '0')){
                stringBuilder.append(c);
            }
            if(c <= 'Z' && c >= 'A'){
                c -= ('A'-'a');
                stringBuilder.append(c);
            }
        }
        return isHuiWen(stringBuilder.toString());
    }

    //判断是否为回文串
    //两头掐一下
    public boolean isHuiWen(String s){
        if(null == s || s.length() <= 1){
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}