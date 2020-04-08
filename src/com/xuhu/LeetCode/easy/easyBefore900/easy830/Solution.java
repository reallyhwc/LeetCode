package com.xuhu.LeetCode.easy.easyBefore900.easy830;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans = new ArrayList<>();
        if(S == null || S.length() <= 2){
            return ans;
        }
        char[] chars = S.toCharArray();
        char lastChar = chars[0];
        int nums = 1;
        for(int i = 1; i < chars.length; i++){
            if(lastChar == chars[i]){
                nums++;
            }else {
                if(nums >= 3){
                    List<Integer> list = new ArrayList<>();
                    list.add(i-nums);
                    list.add(i-1);
                    ans.add(list);
                }
                lastChar = chars[i];
                nums = 1;
            }
        }
        if(nums >= 3){
            List<Integer> list = new ArrayList<>();
            list.add(chars.length - nums);
            list.add(chars.length - 1);
            ans.add(list);
        }
        return ans;
    }
}