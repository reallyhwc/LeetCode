package com.xuhu.LeetCode.easy.easyBefore700.easy682;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
//        boolean[] operating = new boolean[5];
//        ListUtils.pringlnBoolean(operating);
        String[] strings = {"5","2","C","D","+"};
        String[] strings1 = {"5","-2","4","C","D","9","+","+"};
        System.out.println(solution.calPoints(strings));
        System.out.println(solution.calPoints(strings1));
    }
}