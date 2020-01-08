package com.xuhu.LeetCode.easy.easyBefore500.easy0434;


class Solution {
    public int countSegments1(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }

    public int countSegments(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
}
