package com.xuhu.LeetCode.easy.easyBefore500.easy0492;


class Solution {
    public int[] constructRectangle(int area) {
        int num = (int)Math.sqrt(area);
        while (area % num != 0){
            num--;
        }
        return new int[] {area/num,num};
    }
}