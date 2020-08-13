package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D13;


class Solution {
    /**
     * 思路可以看代码实现
     * 一位一位的算然后加起来即可
     * 以及这里的把字符串转换成数组的方式并没有使结果变快......
     * @param num1
     * @param num2
     * @return
     */
    public String multiply(String num1, String num2) {
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        if (n1 < 0 || n2 < 0) {
            return "";
        }
        int[] ans = new int[n1 + n2 + 2];
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        for (int i = n1; i >= 0; i--) {
            for (int j = n2; j >= 0; j--) {
                int temp = (chars1[i] - '0') * (chars2[j] - '0');
                temp += ans[i + j + 1];
                ans[i + j] += temp / 10;
                ans[i + j + 1] = temp % 10;
            }
        }
        StringBuffer sb = new StringBuffer();
        int index = 0;
        while (index < ans.length - 1 && ans[index] == 0) {
            index++;
        }
        for (; index < ans.length; index++) {
            sb.append(ans[index]);
        }
        return sb.toString();
    }
}