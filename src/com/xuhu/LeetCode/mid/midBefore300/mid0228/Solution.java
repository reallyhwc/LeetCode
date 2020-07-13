package com.xuhu.LeetCode.mid.midBefore300.mid0228;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (null == nums || nums.length == 0){
            return list;
        }
        int length = nums.length;
        int begin = nums[0];
        int last = nums[0];
        // begin 表示当前连续数组的开始
        // last  表示当前连续数组的最后一个
        // 那么默认情况，从第二个数字开始进行判断
        for (int i = 1; i < length; i++){
            // 如果当前数字比Last 正好大1 那么还是连续数组，调整一下Last的值即可
            int temp = nums[i];
            if(temp - last == 1){
                last = temp;
            }else {
                // 不然 无法构成更长的连续数组，List中添加相应的值
                // 并调整begin 和last的值
                list.add(method(begin,last));
                begin = temp;
                last = temp;
            }
        }
        list.add(method(begin,last));
        return list;
    }

    private String method(int begin, int last){
        if (begin == last){
            return String.valueOf(begin);
        }
        StringBuilder ans = new StringBuilder();
        ans.append(begin);
        ans.append("->");
        ans.append(last);
        return ans.toString();
    }
}