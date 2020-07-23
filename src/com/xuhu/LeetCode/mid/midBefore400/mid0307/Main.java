package com.xuhu.LeetCode.mid.midBefore400.mid0307;

public class Main {
    public static void main(String[] args) {
        NumArray array = new NumArray(new int[]{1, 3, 5, 7, 9, 11});
        System.out.println(array.sumRange(0, 2));
        array.update(1, 2);
        System.out.println(array.sumRange(0, 2));
    }
}