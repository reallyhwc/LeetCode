package com.xuhu.LeetCode.mid.midBefore300.mid0229;


import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     *
     *
     * 改进版本摩尔计数法
     * xy 表示当前出现次数最多的两个数
     *  cx,cy 则表示出现次数
     *  相同次数+1 不同次数-1 如果为0 就替换
     *  从数学上的角度上来讲，一个数组中，出现次数超过三分之一的树仅有可能有两个
     *
     * @param nums
     * @return
     */
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int x = 0, y = 0, cx = 0, cy = 0;
        for (int item : nums){
            if ((cx == 0 || item == x) && item != y){
                cx++;
                x = item;
            }else if (cy == 0 || item == y){
                cy++;
                y = item;
            }else {
                cy--;
                cx--;
            }
        }
        cx = 0;
        cy = 0;

        for (int item : nums){
            if (item == x){
                cx++;
            }
            if (item == y){
                cy++;
            }
        }
        if (cx > nums.length / 3){
            list.add(x);
        }
        if (cy > nums.length / 3 && x != y){
            list.add(y);
        }

        return list;
    }
}