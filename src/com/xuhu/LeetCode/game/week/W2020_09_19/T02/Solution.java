package com.xuhu.LeetCode.game.week.W2020_09_19.T02;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {

    public int maxSumRangeQuery(int[] nums, int[][] rs) {

        long d[] = new long[100005];
        for(int r[]:rs){
            d[r[0]]++;
            d[r[1]+1]--;
        }
        List<Long> li = new ArrayList<>();
        if(d[0]>0){
            li.add(d[0]);
        }
        for(int i=1;i<=100004;++i){
            d[i] += d[i-1];
            if(d[i]>0){
                li.add(d[i]);
            }
        }
        Collections.sort(li);
        int s=  0;
        Arrays.sort(nums);int p  =nums.length-1;
        for(int i=li.size()-1;i>=0;--i){
            s += li.get(i)*(long)nums[p];
            p--;
            s%= 1000000007;
        }
        return (int)s;

    }

//    public int maxSumRangeQuery(int[] nums, int[][] requests) {
//        int[] times = new int[nums.length];
//        for (int[] array : requests ){
//            if (array[0] == array[1]){
//                times[array[0]]++;
//            }else {
//                for (int i = array[0]; i <= array[1]; i++ ){
//                    times[i]++;
//                }
//            }
//        }
//        Arrays.sort(times);
//        Arrays.sort(nums);
//        long ans = 0;
//        for (int i = nums.length - 1; i >= 0; i--){
//            if (times[i] == 0){
//                break;
//            }
//            ans += times[i] * (nums[i]);
//        }
//
//        return (int) (ans % (1e9 + 7));
//    }
}