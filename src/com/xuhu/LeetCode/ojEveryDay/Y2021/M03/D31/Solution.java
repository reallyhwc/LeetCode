package com.xuhu.LeetCode.ojEveryDay.Y2021.M03.D31;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        if (null == nums || nums.length == 0){
            return ans;
        }

        Arrays.sort(nums);

        List<Integer> tempList = Collections.singletonList(nums[0]);
        ans.add(tempList);
        if (nums.length == 1){
            return ans;
        }
        int lastLen = 1;
        for (int i = 1; i < nums.length; i++) {
            int size = ans.size();
            if (nums[i - 1] != nums[i]){
                lastLen = size;
            }

            for (int j = (size - lastLen); j < size; j++){
                List<Integer> list = new ArrayList<>(ans.get(j));
                list.add(nums[i]);
                ans.add(list);
            }
        }
        return ans;
    }
}