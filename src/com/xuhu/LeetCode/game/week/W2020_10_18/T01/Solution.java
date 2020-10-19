package com.xuhu.LeetCode.game.week.W2020_10_18.T01;

import java.util.Arrays;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] nums1 = new int[26];
        int[] nums2 = new int[26];
        Arrays.fill(nums1, -1);
        Arrays.fill(nums2, -1);
        char[] chars = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (nums1[chars[i]-'a'] == -1){
                nums1[chars[i]-'a'] = i;
            }
        }

        for (int i = len - 1; i >= 0; i--){
            if (nums2[chars[i]-'a'] == -1){
                nums2[chars[i]-'a'] = i;
            }
        }
        int ans = 0;

        for (int i = 0; i < 26; i++) {
            if (nums1[i] != nums2[i]){
                ans = Math.max(ans,nums2[i]-nums1[i]);
            }
        }

        return ans-1;
    }
}