package com.xuhu.LeetCode.mid.midBefore200.mid0165;


class Solution {
    public int compareVersion(String version1, String version2) {
        String[] strings1 = version1.split("\\.");
        String[] strings2 = version2.split("\\.");
        int length1 = strings1.length;
        int length2 = strings2.length;
        int length = Math.max(length1, length2);
        for (int i = 0; i < length; i++){

            int nums1 = i < length1 ? Integer.parseInt(strings1[i]) : 0;
            int nums2 = i < length2 ? Integer.parseInt(strings2[i]) : 0;
            if(nums1 > nums2){
                return 1;
            }else if (nums1 < nums2){
                return -1;
            }
        }
        return 0;
    }
}