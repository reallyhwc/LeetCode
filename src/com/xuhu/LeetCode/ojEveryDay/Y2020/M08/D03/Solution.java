package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D03;


class Solution {
    public String addStrings(String num1, String num2) {
        if (num1 == null || num1.length() == 0) {
            return num2;
        }
        if (num2 == null || num2.length() == 0){
            return num1;
        }
        int length1 = num1.length();
        int length2 = num2.length();
        int max = Math.max(length1, length2);
        int nowIndex = 1;
        int addNum = 0;
        StringBuilder sb = new StringBuilder();
        while (nowIndex <= max){
            int nowNum1 = nowIndex <= length1 ? num1.charAt(length1 - nowIndex) - '0' : 0;
            int nowNum2 = nowIndex <= length2 ? num2.charAt(length2 - nowIndex) - '0' : 0;
            int tempNum = nowNum1 + nowNum2 + addNum;
            sb.append(tempNum % 10);
            addNum = tempNum / 10;
            nowIndex++;
        }
        if (addNum != 0){
            sb.append(addNum);
        }
        return sb.reverse().toString();
    }
}