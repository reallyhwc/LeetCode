package com.xuhu.LeetCode.easy.easyBefore200.easy0119;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        /**
         * 通过一个比较巧妙地方式去循环实现
         * 如果输入0  list 添加1 返回
         * 如果输入1 在list = 1 的情况下再追加1 返回
         * 如果输入2 在list = 1 1 的情况下添加1 并把不属于头尾的数字，处理成上一层的两个数相加（杨辉三角规则）
         * list = 1 2 1
         * 如果输入3
         * list = 1 2 1       最开始
         *        1 2 1 1     添加一个1
         *        1 2 3 1     从后到前处理非头尾的数   list.set(j,list.get(j) + list.get(j - 1));
         *        1 3 3 1     继续处理
         *  返回
         *  通过上面的应该可以粗略的理解原理
         */
        for(int i = 0; i <= rowIndex; i++){
            list.add(1);
            for(int j = i - 1; j >= 1; j--){
                list.set(j,list.get(j) + list.get(j - 1));
            }
        }
        return list;
    }
}