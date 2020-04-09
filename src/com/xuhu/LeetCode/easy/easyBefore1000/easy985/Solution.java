package com.xuhu.LeetCode.easy.easyBefore1000.easy985;


class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] ans = new int[A.length];
        int nowSum = 0;
        for(int x : A){
            if((x & 1) == 0){
                nowSum += x;
            }
        }
        int index = 0;
        for (int[] X : queries){
            //原本偶数
            if((A[X[1]] & 1) == 0){
                //调整的也是偶数
                if((X[0] & 1) == 0){
                    nowSum += X[0];
                }else {
                    //调整的是奇数
                    nowSum -= A[X[1]];
                }
            }else {
                //原本是奇数
                //调整的也是奇数
                if((X[0] & 1) == 1){
                    nowSum += (A[X[1]] + X[0]);
                }
            }
            A[X[1]] += X[0];
            ans[index] = nowSum;
            index++;
        }

        return ans;
    }
}