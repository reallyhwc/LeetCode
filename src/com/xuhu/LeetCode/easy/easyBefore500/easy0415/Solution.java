package com.xuhu.LeetCode.easy.easyBefore500.easy0415;


class Solution {

    public String addStrings(String num1, String num2) {
        if(num1.length() > num2.length()){
            return addStrings(num2,num1);
        }
        StringBuffer sb = new StringBuffer();
        int add = 0;
        for(int i = 0; i < num2.length(); i++){
            int a = (num1.length() > i) ? num1.charAt(num1.length() - 1 - i) - 48 : 0;
            int b = num2.charAt(num2.length() - 1 - i) - 48;
            sb.append((a + b + add) % 10);
            add = (a + b + add) / 10;
        }
        if(add == 1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }










    //时间复杂度太高，再来一次
    private int add = 0;
    public String addStrings1(String num1, String num2) {
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