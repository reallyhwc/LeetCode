package com.xuhu.LeetCode.easyBefore200.easy0118;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        //利用循环求解
        for(int i = 0; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            //第一行只填充一个值1
            if(i == 0){
                temp.add(1);
                result.add(temp);
                continue;
            }
            //给每一行第一个值填充1
            temp.add(1);
            //把每一行的中间值按照杨辉三角的模式来填充
            for(int j = 1; j < i; j++){
                temp.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            //给每一行的最后一个值填充1
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}