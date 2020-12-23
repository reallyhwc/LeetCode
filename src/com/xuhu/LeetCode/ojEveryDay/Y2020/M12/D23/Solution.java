package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D23;


import java.util.HashSet;
import java.util.Set;

class Solution {

    public int firstUniqChar(String s) {
        int[] nums = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            nums[(chars[i]-'a')]++;
        }
        for (int i = 0; i < chars.length; i++) {
            if(nums[(chars[i]-'a')] == 1){
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar1(String s) {
        Set<Character> set = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character> ();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (set.contains(aChar)) {
                set2.add(aChar);
            } else {
                set.add(aChar);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (!set2.contains(chars[i])){
                return i;
            }
        }
        return -1;
    }
}