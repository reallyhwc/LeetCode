package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D02;


class Solution {

    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int len = s.length();
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        int res = 0;
        int max = 0;
        while (right < len){
            count[chars[right]-'A']++;
            max = Math.max(max, count[chars[right]-'A']);
            if (right - left + 1 - max > k){
                count[chars[left] - 'A']--;
                left++;
            }
            right++;
            res = Math.max(res,right - left);
        }
        return res;
    }

    public int characterReplacement01(String s, int k) {
        int[] count = new int[26];
        int len = s.length();
        char[] chars = s.toCharArray();
        int max = 0;
        int left = 0;
        int right = 0;
        while (right < len) {
            count[chars[right] - 'A']++;
            int maxCount = maxCount(count);
            if (right - left + 1 - maxCount > k) {
                count[chars[left] - 'A']--;
                left++;
            }
            right++;
            max = Math.max(max, right - left);
        }
        return max;
    }

    private int maxCount(int[] count) {
        int ans = count[0];
        for (int i = 1; i < 26; i++) {
            ans = Math.max(ans, count[i]);
        }
        return ans;
    }
}
