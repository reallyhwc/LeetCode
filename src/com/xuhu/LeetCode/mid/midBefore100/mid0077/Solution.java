package com.xuhu.LeetCode.mid.midBefore100.mid0077;


import java.util.ArrayList;
import java.util.LinkedList;
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




//    List<List<Integer>> listAll = new LinkedList<>();
//    int n;
//    int k;
//
//    public List<List<Integer>> combine(int n, int k) {
//        this.n = n;
//        this.k = k;
//        backTrack(1,new LinkedList<Integer>());
//        return listAll;
//    }
//
//    private void backTrack(int first, LinkedList<Integer> list){
//        if(list.size() == k){
//            listAll.add(new LinkedList<>(list));
//        }
//
//        for(int i = first; i < n+1; i++){
//            list.add(i);
//            backTrack(i+1, list);
//            list.removeLast();
//        }
//
//    }


}