package com.xuhu.LeetCode.easy.easyBefore100.easy0067;


class Solution {
    public String addBinary(String a, String b) {
        StringBuffer result = new StringBuffer();
        int la = a.length() - 1;
        int lb = b.length() - 1;
        int res = 0;
        //每次去取两个字符串的最后一位，并把这两个数字与上一阶段的进位相加（如果取不到也就是这个字符串已经取完了的情况）
        //则通过三目运算符 给res加上0 即可，给返回值加上res % 2 ，res则表示进位
        //如此，结束一个循环
        while(la >= 0 || lb >= 0 || res > 0){
            res += (la >= 0) ? a.charAt(la--) - '0' : 0;
            res += (lb >= 0) ? b.charAt(lb--) - '0' : 0;
            result.append(res%2);
            res /= 2;
        }
        return result.reverse().toString();
    }
}