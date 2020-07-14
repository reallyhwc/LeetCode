package com.xuhu.LeetCode.mid.midBefore300.mid0264;


class Solution {
    /**
     * 三指针法
     * 注意这里不要用List，时间会比较长
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        int[] array = new int[n];
        array[0] = 1;
        int index2 = 0,index3 = 0, index5 = 0;
        for (int i = 1; i < n; i++){
            int a = array[index2] * 2;
            int b = array[index3] * 3;
            int c = array[index5] * 5;
            int num = Math.min(a, Math.min(b,c));
            if (num == a){
                index2++;
            }
            if (num == b){
                index3++;
            }
            if (num == c){
                index5++;
            }
            array[i] = num;
        }
        return array[n-1];
    }
}