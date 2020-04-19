package com.xuhu.LeetCode.mid.midBefore100.mid0043;


class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;

        if(n1 < 0 || n2 < 0) return "";

        int mul[] = new int[n1+n2+2];

        for(int i = n1; i >= 0; i--){
            for(int j = n2; j >= 0; j--){
                int temp = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                //先加上低位判断是否有新的进位
                temp += mul[i + j + 1];

                mul[i+j] += temp / 10;
                mul[i+j+1] = temp % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < mul.length - 1 && mul[i] == 0) i++;

        for(; i < mul.length; i++){
            sb.append(mul[i]);
        }

        return sb.toString();
    }
}