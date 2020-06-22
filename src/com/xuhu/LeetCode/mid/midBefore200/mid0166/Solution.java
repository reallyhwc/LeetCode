package com.xuhu.LeetCode.mid.midBefore200.mid0166;


import java.util.HashMap;
import java.util.Map;

class Solution {

    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        StringBuilder sb = new StringBuilder();
        if(numerator < 0 ^ denominator < 0){
            sb.append("-");
        }

        long dividend = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));
        sb.append(String.valueOf(dividend/divisor));
        long remainder = dividend % divisor;
        if(remainder == 0){
            return sb.toString();
        }
        sb.append(".");
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