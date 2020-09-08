package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D08;


import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> listAll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backTrack(list,listAll,1,k,n);
        return listAll;
    }

    private void backTrack(List<Integer> list, List<List<Integer>> listAll, int start, int k, int n){
        if(k == 0){
            listAll.add(new ArrayList<>(list));
            return;
        }
        //需要注意这个时候的剪枝跳出条件！ 很关键
        for(int i = start; i+k <= n+1; i++){
            list.add(i);
            backTrack(list,listAll,i+1,k-1,n);
            list.remove(list.size()-1);
        }
    }
}
