package com.xuhu.LeetCode.mid.midBefore300.mid0216;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] flag = new boolean[10];
        method(ans,list,0,n,flag,0,0,k);
        return ans;
    }

    /**
     *
     * @param ans 用作返回的双层List
     * @param list 用作临时存放结果的单层List
     * @param nowSum 当前总和
     * @param n 所需要的总和
     * @param flag 标记数组
     * @param nowLastIndex 当前的最后一个Index（去重）
     * @param nowSize 当前使用的数字个数
     * @param k 所需要使用的数字的个数
     */
    private void method(List<List<Integer>> ans, List<Integer> list, int nowSum, int n, boolean[] flag, int nowLastIndex,int nowSize, int k){
        if(nowSum > n || nowSize > k){
            return;
        }
        if(nowSum == n){
            if(nowSize == k){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        for (int i = nowLastIndex+1; i < 10; i++){
            if (!flag[i]){
                flag[i] = true;
                list.add(i);
                method(ans,list,nowSum+i,n,flag,i,nowSize+1,k);
                list.remove(list.size()-1);
                flag[i] = false;
            }
        }

    }
}