package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D11;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ansList = new ArrayList<> ();
        backTrace(ansList,new ArrayList<> (),k,n,1,0);
        return ansList;
    }

    private void backTrace(List<List<Integer>> ansList, List<Integer> list, int k, int n, int begin, int nowSum){
        if (list.size() == k){
            if (nowSum == n){
                ansList.add(new ArrayList<>(list));
            }
            return;
        }
        if (nowSum >= n){
            return;
        }
        for (int i = begin; i <= 9; i++) {
            list.add(i);
            backTrace(ansList,list,k,n,i+1,nowSum+i);
            list.remove(list.size() - 1);
        }
    }
}