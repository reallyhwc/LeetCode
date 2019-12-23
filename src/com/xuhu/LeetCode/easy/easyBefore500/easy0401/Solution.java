package com.xuhu.LeetCode.easy.easyBefore500.easy0401;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> list = new LinkedList<>();
        for(int i = 0; i < 12; i++){
            int counti = count1(i);
            for(int j = 0; j < 60; j++){
                if(counti + count1(j) == num){
                    list.add(i + ":" + (j<10 ? "0" + j : j));
                }
            }
        }
        return list;
    }

    int count1(int num){
        int res = 0;
        while (num != 0){
            num = num&(num-1);
            res++;
        }
        return res;
    }
}