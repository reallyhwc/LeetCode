package com.xuhu.LeetCode.game.week.W2020_09_19.T01;


    class Solution {
        public int sumOddLengthSubarrays(int[] arr) {
            if (null == arr || arr.length == 0){
                return 0;
            }
            int length = arr.length;
            int[] sum = new int[length+1];
            sum[0] = 0;
            for (int i = 1; i <=length; i++){
                sum[i] = sum[i-1] + arr[i-1];
            }
            int ans = 0;
            for (int len = 1; len <= length ;len += 2){
                for (int i = 0; i < length; i++) {
                    if ((i+len) <= length){
                        ans += (sum[i+len] - sum[i]);
                    }
                }
            }

            return ans;
        }
    }