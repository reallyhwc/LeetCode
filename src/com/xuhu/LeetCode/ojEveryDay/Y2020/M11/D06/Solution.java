package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D06;


import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> list = new ArrayList<> ();

        for (int num : arr){
            list.add(num);
        }

        int[] b = new int[10001];

        for (int i = 1; i <= 10000; i++){
            b[i] = (b[i>>1] + (i&1));
        }
        list.sort((x,y)->{
            if (b[x] == b[y]){
                return x - y;
            }else {
                return b[x] - b[y];
            }
        });

        for (int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}