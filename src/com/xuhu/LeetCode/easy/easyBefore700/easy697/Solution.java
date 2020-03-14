package com.xuhu.LeetCode.easy.easyBefore700.easy697;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> left = new HashMap<>();
        Map<Integer,Integer> right = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            map.put(x,map.getOrDefault(x,0) + 1);
            if(!left.containsKey(x)){
                left.put(x,i);
            }
            right.put(x,i);
        }
        int ans = nums.length;
        int max = Collections.max(map.values());

        for(int i : map.keySet()){
            if(map.get(i) == max){
                ans = Math.min(ans,right.get(i) - left.get(i) + 1);
            }
        }
        return ans;

    }

//    时间复杂度很低的方法，供参考
//    public int findShortestSubArray(int[] nums) {
//        int maxNum = Integer.MIN_VALUE, minNum = Integer.MAX_VALUE;
//        //求出数组中的最大值和最小值
//        for (int i : nums) {
//            if (i > maxNum) maxNum = i;
//            if (i < minNum) minNum = i;
//        }
//
//        //创建数组统计每个数字出现的次数以及出现的最大次数；
//        int[] count = new int[maxNum - minNum + 1];
//        int maxLen = -1;
//        for (int i : nums) {
//            count[i - minNum] ++;
//            if (count[i - minNum] > maxLen)
//                maxLen = count[i - minNum];
//        }
//
//        if (maxLen == 1) return maxLen;
//        int ans = Integer.MAX_VALUE;
//        for (int i = 0; i < count.length; i++) {
//            if (count[i] == maxLen) {
//                int start = 0, end = nums.length - 1;
//                while (start < end && nums[start] != i + minNum)
//                    start++;
//                while (end >= 0 && nums[end] != i + minNum)
//                    end--;
//                if (end - start + 1 < ans)
//                    ans = end - start + 1;
//            }
//        }
//
//        return ans;
//    }
}