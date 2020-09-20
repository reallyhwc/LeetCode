package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D20;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<> ();
        backTrace(ansList,new ArrayList<> (),nums,0);
        return ansList;
    }

    private void backTrace(List<List<Integer>> ansList, List<Integer> list, int[] nums, int nowIndex){
        if (nowIndex == nums.length){
            ansList.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[nowIndex]);
        backTrace(ansList,list,nums,nowIndex+1);
        list.remove(list.size() - 1);

        backTrace(ansList,list,nums,nowIndex+1);
    }
}