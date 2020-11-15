package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D15;

class Solution {
    public String removeKdigits(String num, int k) {
        if (num == null || num.length() == 0){
            return num;
        }
        if (num.length() == k){
            return "0";
        }
        StringBuilder sb = new StringBuilder(num);
        // 思路，从左到右，找出第一个比后面大的字符 删去，清零 重复k次
        for (int i = 0; i < k; i++){
            int idx = 0;
            for (int j = 1; j < sb.length() && sb.charAt(j) >= sb.charAt(j-1); j++) {
                idx = j;
            }
            sb.deleteCharAt(idx);
            while (sb.length() > 1 && sb.charAt(0) == '0'){
                sb.deleteCharAt(0);
            }
        }
        return sb.toString();
    }
}