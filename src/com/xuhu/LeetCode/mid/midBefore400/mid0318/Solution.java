package com.xuhu.LeetCode.mid.midBefore400.mid0318;


class Solution {
    /**
     * 主要思路 通过位运算  利用一个int 字段来存储每个单词中
     * 是否出现了某个字母
     * 听起来比较难理解
     * java 对于int数字类型采用4*8三十二位二进制来进行存储
     * 题意中 表示出现的都是小写字母  也就最多范围只会有26个
     * 利用int的二进制的某一位来表示这个单词中这个字母是否出现过 0 表示没有  1 则表示有
     * 要想达到题意中的  效果 那么两个单词之间的  是不允许有重复的字母的  那么表示这个单词中字母出现规则的两个int数
     * 互相 进行 &  的话 结果应该为0
     * 以上！
     * @param words
     * @return
     */
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] hash = new int[n];
        for (int i = 0; i < n; i++) {
            for (char c : words[i].toCharArray()) {
                hash[i] |= 1 << c - 'a';
            }
        }
        int max = 0;
        for (int i = 0; i < n - 1; i++){
            for (int j = i+1; j < n; j++){
                if ((hash[i] & hash[j]) == 0){
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}