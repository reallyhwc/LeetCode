package com.xuhu.LeetCode.easy.easyBefore800.easy0717;


class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits == null || bits.length == 0) return false;
        int nums = 0;
        if(bits[bits.length - 1] != 0) return false;
        for(int i = bits.length - 2; i >= 0; i--){
            if(bits[i] == 1){
                nums++;
            }else {
                break;
            }
        }
        return nums % 2 == 0;
    }
}