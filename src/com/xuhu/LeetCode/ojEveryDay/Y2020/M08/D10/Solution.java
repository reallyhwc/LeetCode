package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D10;


import java.util.ArrayList;
import java.util.List;

class Solution {

    /**
     * 改进版
     * @param s
     * @return
     */
    public int countBinarySubstrings(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        char[] chars = s.toCharArray();
        char last = chars[0];
        int pre = 0;
        int lastNum = 1;
        int ans = 0;
        for (int i = 1; i < chars.length; i++){
            if (last == chars[i]){
                lastNum++;
            }else {
                ans += Math.min(pre,lastNum);
                last = chars[i];
                pre = lastNum;
                lastNum = 1;
            }
        }
        ans += Math.min(pre,lastNum);

        return ans;
    }

    /**
     * 先统计连续的0和1分别有多少个，如：111100011000，
     * 得到4323；在4323中的任意相邻两个数字，取小的一个加起来，就是3+2+2 = 7.
     * @param s
     * @return
     */
    public int countBinarySubstrings1(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        char last = s.charAt(0);
        int lastNum = 1;
        for (int i = 1; i < s.length(); i++){
            if (last == s.charAt(i)){
                lastNum++;
            }else {
                list.add(lastNum);
                last = s.charAt(i);
                lastNum = 1;
            }
        }
        list.add(lastNum);

        int ans = 0;
        for (int i = 1; i < list.size(); i++ ){
            ans += Math.min(list.get(i-1),list.get(i));
        }
        return ans;
    }
}