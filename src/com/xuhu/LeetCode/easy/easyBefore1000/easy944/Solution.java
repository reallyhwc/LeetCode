package com.xuhu.LeetCode.easy.easyBefore1000.easy944;


class Solution {
    public int minDeletionSize(String[] A) {
        int nums = A.length;
        int length = A[0].length();
        int ans = 0;
        for(int i = 0; i < length; i++){
            for(int j = 1; j < nums; j++){
                if(A[j].charAt(i) < A[j-1].charAt(i)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}