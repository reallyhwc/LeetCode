package com.xuhu.LeetCode.easy.easyBefore800.easy0728;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(method(i)){
                list.add(i);
            }
        }
        return list;
    }

    private boolean method(int num){
        int value = num;
        while (value > 0){
            if(value % 10 != 0 && num%(value % 10) == 0){
                value /= 10;
            }else {
                return false;
            }
        }
        return true;
    }
}