package com.xuhu.LeetCode.easyBefore200.easy0118;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.generate(30);
        for(List<Integer> list : lists){
            for(Integer X : list){
                System.out.print(X + "\t\t");
            }
            System.out.println();
        }

    }
}