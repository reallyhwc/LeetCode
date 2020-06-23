package com.xuhu.LeetCode.mid.midBefore200.mid0166;


import java.util.HashMap;
import java.util.Map;

class Solution {

    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder sb = new StringBuilder();
        // 两个相同则为 false 两个不相同则为true （说明符号不同，拼上一个负号）
        if(numerator < 0 ^ denominator < 0){
            sb.append("-");
        }
        // 被除数
        long dividend = Math.abs(Long.valueOf(numerator));
        // 除数
        long divisor = Math.abs(Long.valueOf(denominator));
        // 拼接小数点前的值
        sb.append(String.valueOf(dividend/divisor));
        long remainder = dividend % divisor;
        // 如果能整除，那么直接返回前半段结果即可
        if(remainder == 0){
            return sb.toString();
        }
        // 说明不能整除 拼接上小数点
        sb.append(".");
        // map中存放 当前余数+当前字符串长度信息
        // 如果当前余数相等了，那么说明存在了循环 在相应的字符串地方补上括号即可
        Map<Long,Integer> map = new HashMap<>();
        while (remainder != 0){
            if (map.containsKey(remainder)){
                sb.insert(map.get(remainder),"(");
                sb.append(")");
                break;
            }
            map.put(remainder,sb.length());
            remainder *= 10;
            sb.append((String.valueOf(remainder/divisor)));
            remainder %= divisor;
        }
        return sb.toString();

    }

//    public String fractionToDecimal(int numerator, int denominator) {
//        if(numerator == 0 || denominator == 0){
//            return "0";
//        }
//
//        int sign = 0;
//        if(numerator > 0 & denominator < 0){
//            sign = -1;
//        }
//
//        long big = (long)numerator / (long)denominator;
//        long small = numerator % denominator;
//        StringBuffer result = new StringBuffer(String.valueOf(big));
//        if(sign == -1){
//            result.insert(0,"-");
//        }
//        if (small != 0){
//            result.append(".");
//            StringBuffer smallStr = new StringBuffer();
//            Map<String,Integer> smallIndex = new HashMap<>();
//            while (small != 0){
//                small *= 10;
//                big = small / denominator;
//                small = small % denominator;
//                String str = small + "_" + big;
//                if(smallIndex.containsKey(str)){
//                    smallStr.append(")");
//                    smallStr.insert(smallIndex.get(str),"(");
//                    break;
//                }else {
//                    smallIndex.put(str,smallStr.length());
//                    smallStr.append(Math.abs(big));
//                }
//            }
//            result.append(smallStr);
//        }
//
//        return result.toString();
//    }
}