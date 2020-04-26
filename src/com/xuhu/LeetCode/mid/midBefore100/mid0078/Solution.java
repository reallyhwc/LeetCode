package com.xuhu.LeetCode.mid.midBefore100.mid0078;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listAll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        method(listAll,list,nums.length,0,nums);
        return listAll;
    }

    private void method(List<List<Integer>> listAll, List<Integer> list, int n, int target,int[] nums){
        if(target == n){
            listAll.add(new ArrayList<>(list));
            return;
        }
        method(listAll,list,n,target+1,nums);
        list.add(nums[target]);
        method(listAll,list,n,target+1,nums);
        list.remove(list.size()-1);
    }
}