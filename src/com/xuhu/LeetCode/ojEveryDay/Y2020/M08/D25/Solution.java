package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D25;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

     List<Integer> temp = new ArrayList<> ();
     List<List<Integer>> ans = new ArrayList<> ();


    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0,Integer.MIN_VALUE,nums);
        return ans;
    }

    private void dfs(int cur, int last, int[] nums){
        if (cur == nums.length){
            if (temp.size() >= 2){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if (nums[cur] >= last){
            // 这一步 常人都可以理解，既然符合递增条件，那就添加进list  继续dfs即可
            temp.add(nums[cur]);
            dfs(cur+1,nums[cur],nums);
            temp.remove(temp.size() - 1);
        }

        // 这一步的思路 比较巧妙 属于一种剪枝法，只要当前点与上一点不相同，跳过这个点继续dfs
        // 具体细则还是建议参看 LeetCode官方题解
        // https://leetcode-cn.com/problems/increasing-subsequences/solution/di-zeng-zi-xu-lie-by-leetcode-solution/

        if (nums[cur] != last){
            dfs(cur + 1, last,nums);
        }
    }


//  以下为自己尝试的版本，仅击败11%的用户，大量的时间被消耗在了去重等判断上面，优化一下
//    List<List<Integer>> andList;
//    Set<String> ansSet;
//    public List<List<Integer>> findSubsequences(int[] nums) {
//        andList = new ArrayList<> ();
//        ansSet = new HashSet<> ();
//        int length = nums.length;
//        dfs(andList,new ArrayList<> (),0,nums,length);
//        return andList;
//    }
//
//    private void dfs(List<List<Integer>> ansList, List<Integer> nowList, Integer index, int[] nums, int length){
//        if (nowList.size() >= 2){
//            String s = convertListToString(nowList);
//            if (!ansSet.contains(s)){
//                ansList.add(new ArrayList<>(nowList));
//                ansSet.add(s);
//            }
//        }
//        if (index >= length){
//            return;
//        }
//        if (nowList.isEmpty()){
//            for (int i = index; i < length; i++) {
//                nowList.add(nums[i]);
//                dfs(ansList,nowList,i+1,nums,length);
//                nowList.remove(nowList.size()-1);
//            }
//        }else {
//            int target = nowList.get(nowList.size() - 1);
//            Set<Integer> set = new HashSet<>();
//            for (int i = index; i < length; i++) {
//                if (!set.contains(nums[i]) && nums[i] >= target){
//                    set.add(nums[i]);
//                    nowList.add(nums[i]);
//                    dfs(ansList,nowList,i+1,nums,length);
//                    nowList.remove(nowList.size()-1);
//                }
//            }
//        }
//    }
//
//    private String convertListToString(List<Integer> list){
//        StringBuilder sb = new StringBuilder();
//        for (Integer i : list){
//            sb.append(i).append(',');
//        }
//        sb.deleteCharAt(sb.length() - 1);
//        return sb.toString();
//    }
}