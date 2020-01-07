package com.xuhu.LeetCode.easy.easyBefore500.easy0415;


class Solution {

    //时间复杂度太高，再来一次
    private int add = 0;
    public String addStrings(String num1, String num2) {
        num1 = (new StringBuffer(num1).reverse().toString());
        num2 = (new StringBuffer(num2).reverse().toString());
        StringBuffer result = new StringBuffer();
        int length = Math.max(num1.length(), num2.length());
        for(int i = 0; i < length; i++){
            result.append(method(i >= num1.length() ? null : num1.charAt(i),i >= num2.length() ? null : num2.charAt(i)));
        }
        if(0 != add){
            result.append(add);
        }
        return result.reverse().toString();
    }

    public int method(Character a, Character b){
        int num = add;
        if(null != a){
            num += (a - '0');
        }
        if(null != b){
            num += (b - '0');
        }

        if(num <= 9){
            add = 0;
            return num;
        }else{
            add = num / 10;
            return num%10;
        }

    }
}