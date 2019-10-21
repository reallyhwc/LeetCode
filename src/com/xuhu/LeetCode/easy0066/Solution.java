package com.xuhu.LeetCode.easy0066;


class Solution {
    public int[] plusOne(int[] digits) {
        //从最后一位开始，只要最后一位不为9，则把此数字+1，否则
        //也就是，此位数为9，加一则进位成为10，把此位数置为0
        //能够进入到下一循环则，表示上一位数为9，已经是进位操作了
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}