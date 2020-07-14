package com.xuhu.LeetCode.mid.midBefore300.mid0274;


import java.util.Arrays;

class Solution {


    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] array = new int[n+1];
        // 计数 超大的则视为 n
        for (int num : citations){
            array[Math.min(n,num)]++;
        }
        int k = n;
        for (int s = array[k]; k > s; s += array[k]){
            k--;
        }
        return k;
    }

    /*
     * 思路：
     *
     * 1、首先看到h个元素大于等于某个值，N-h个元素小于等于某个值，这显然是一个有序序列的特征，所以自然而然的想到先将数组排序；
     *
     * 2、将数组排序之后，对于给定的某个i，我们知道有citations.length - i篇论文的引用数 ≥ citations[i]，i篇
     *    论文的引用数 ≤ citations[i]；
     *
     * 3、不妨设h = citations.length - i，即至多有h篇论文分别引用了至少citation[i]次，其余citations.length - h篇
     *    论文的引用数不多于citation[i]次。
     *
     *    既然如此，只要citation[i] ≥ h，就满足题意。
     */
    /*
     * 举个例子 对于题例数组 3,0,6,1,5
     * 排序后              0 1 3 5 6
     * 从前往后相应H  为   5 4 3 2 1
     * 意思是在原数组排序之后，第一个值如果不小于5 说明最小的论文的引用次数大于5（数组长度） 那么就可以返回5
     * 否则，继续往后比对，看当前引用次数第（length-i）高的论文引用次数是否不小于length - i
     *
     */
    public int hIndex1(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0 ; i < citations.length; i++){
            int h = citations.length - i;
            if(h <= citations[i]){
                return h;
            }
        }
        return 0;
    }


}