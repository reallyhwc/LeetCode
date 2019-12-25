package com.xuhu.LeetCode.easy.easyBefore500.easy0405;

class Solution {

    //本身计算机存储的就是数字的补码，所以直接每四位二进制数转换成一个16进制数即可
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] chars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuffer stringBuffer = new StringBuffer();
        while (stringBuffer.length() < 8 && num != 0){
            stringBuffer.append(chars[num & 0xf]);
            num >>= 4;
        }
        return stringBuffer.reverse().toString();
    }
}