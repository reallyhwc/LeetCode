package com.xuhu.LeetCode.easy.easyBefore1000.easy989;


import com.xuhu.LeetCode.a.util.ListUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        int addNum = 0;
        int index = A.length-1;
        while (index >= 0 || K > 0){
            int now = 0;
            now += addNum;
            if(K != 0){
                now += (K % 10);
                K /= 10;
            }
            if(index >= 0){
                now += A[index];
            }
            addNum = now / 10;
            now = now % 10;
            list.add(now);
            index--;
        }
        if(addNum != 0){
            list.add(addNum);
        }
        Collections.reverse(list);
        return list;
    }
}