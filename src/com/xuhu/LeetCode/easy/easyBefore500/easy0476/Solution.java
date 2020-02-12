package com.xuhu.LeetCode.easy.easyBefore500.easy0476;


class Solution {
    public int findComplement(int num) {
        int length = findNumLength(num);
        int ans = 0;
        int tempNum = 1;
        for(int i = 0; i < length; i++){
            if(((num >> i) & 1) == 0){
                ans += (tempNum << i);
            }
        }
        return ans;
    }

    public int findNumLength(int num){
        int ans = 0;
        while (num > 0){
            ans++;
            num >>= 1;
        }
        return ans;
    }
}