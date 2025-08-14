package com.xuhu.LeetCode.easy02.easyBefore100.easy067;


class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int res = 0;
        while (aIndex >= 0 || bIndex >= 0 || res > 0) {
            res += aIndex >= 0 ? a.charAt(aIndex--) - '0' : 0;
            res += bIndex >= 0 ? b.charAt(bIndex--) - '0' : 0;
            result.append(res % 2);
            res /= 2;
        }

        return result.reverse().toString();
    }
}