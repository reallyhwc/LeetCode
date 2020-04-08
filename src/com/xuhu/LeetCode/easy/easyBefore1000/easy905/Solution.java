package com.xuhu.LeetCode.easy.easyBefore1000.easy905;


class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i < j){
            //前一个是偶数 不动
            if((A[i] & 1)==0 ){
                if((A[j]&1)==1){
                    j--;
                }
                i++;
            }else {
                //前一个是奇数
                //后一个是偶数
                if((A[j] & 1) == 0){
                    //交换
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                    i++;
                }
                j--;
            }
        }
        return A;
    }
}