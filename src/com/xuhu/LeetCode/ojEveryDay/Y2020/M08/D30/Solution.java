package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D30;


class Solution {
    public String reverseWords(String s) {
        int laseBeginCharIndex = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '){
                // 因为是一个easy的题目，字符串中只有单词和空格
                // 所以如果一旦碰到了空格，说明我们已经经过了一个单词了
                // 截取出来 反转这个单词
                convertChar(chars,laseBeginCharIndex,i-1);
                laseBeginCharIndex = i+1;
                i++;
            }
        }
        // 反转最后一个单词
        convertChar(chars,laseBeginCharIndex,chars.length - 1);
        return new String(chars);
    }

    // 反转某一个单词的 顺序
    private void convertChar(char[] chars, int begin, int end){
        while (begin < end){
            char c = chars[begin];
            chars[begin] = chars[end];
            chars[end] = c;
            begin++;
            end--;
        }
    }
}