package com.xuhu.LeetCode.ojEveryDay.Y2021.Test;

/**
 * @author XuHu
 * @date 2021/9/6 7:36 下午
 * @Desc
 */
public class Solution {


    /**
     * 输入N 输出丑数
     *
     * @param n n
     * @return index N uglyNum
     */
    public static int getUglyNum(int n){
        if (n == 1){
            return 1;
        }
        if (n <= 0){
            return -1;
        }
        // 定义三个下标 用作表示 上一个 * 2/3/5  的数的下标
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;

        // 用作存储丑数
        int[] array = new int[n + 1];
        array[0] = 1;
        for (int i = 1; i < n; i++){
            // 每循环一次求出下一个丑数 第一个为1
            int num2 = array[index2] * 2;
            int num3 = array[index3] * 3;
            int num5 = array[index5] * 5;
            int finalNum = Math.min(num2, Math.min(num3, num5));
            if (finalNum == num2){
                index2++;
            }
            if (finalNum == num3){
                index3++;
            }
            if (finalNum == num5){
                index5++;
            }
            array[i] = finalNum;
        }

        return array[n-1];
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++){
            System.out.println(getUglyNum(i));
        }
    }
}
