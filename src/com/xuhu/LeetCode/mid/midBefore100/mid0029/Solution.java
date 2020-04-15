package com.xuhu.LeetCode.mid.midBefore100.mid0029;


class Solution {
    /**
     * 解题思路：这题是除法，所以先普及下除法术语
     * 商，公式是：(被除数-余数)÷除数=商，记作：被除数÷除数=商...余数，是一种数学术语。
     * 在一个除法算式里，被除数、余数、除数和商的关系为：(被除数-余数)÷除数=商，记作：被除数÷除数=商...余数，
     * 进而推导得出：商×除数+余数=被除数。
     *
     * 要求商，我们首先想到的是减法，能被减多少次，那么商就为多少，但是明显减法的效率太低
     *
     * 那么我们可以用位移法，因为计算机在做位移时效率特别高，向左移1相当于乘以2，向右位移1相当于除以2
     *
     * 我们可以把一个dividend（被除数）先除以2^n，n最初为31，不断减小n去试探,当某个n满足dividend/2^n>=divisor时，
     *
     * 表示我们找到了一个足够大的数，这个数*divisor是不大于dividend的，所以我们就可以减去2^n个divisor，以此类推
     *
     * 我们可以以100/3为例
     *
     * 2^n是1，2，4，8...2^31这种数，当n为31时，这个数特别大，100/2^n是一个很小的数，肯定是小于3的，所以循环下来，
     *
     * 当n=5时，100/32=3, 刚好是大于等于3的，这时我们将100-32*3=4，也就是减去了32个3，接下来我们再处理4，同样手法可以再减去一个3
     *
     * 所以一共是减去了33个3，所以商就是33
     *
     * 这其中得处理一些特殊的数，比如divisor是不能为0的，Integer.MIN_VALUE和Integer.MAX_VALUE
     *
     */
    public int divide(int dividend, int divisor) {
        //被除数为0 返回0
        if(dividend == 0){
            return 0;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        boolean nagative;
        //骚操作，用异或来计算符号是否相异
        nagative = (dividend ^ divisor) < 0;
        long t = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        int result = 0;
        for(int i = 31; i >= 0; i--){
            //把被除数从缩小 2^31倍开始，到缩小2^30,2^29...(需要注意的是在这个过程中数字是逐步变大的)
            //直到找出恰好使得 被除数 >= 2^i * d
            if(t >> i >= d){
                //结果集中加上 2^i 为什么要加上这么多？ 因为 被除数 >= 2^i * d
                result += 1<<i;
                //被除数减去 2^i * d
                t -= d<<i;

                // 需要注意的是，这个时候并没有跳出循环，也没有进入新的循环
                // 因为被除数此时  = t - 2^i * d  并不确保为0 ，但是剩余的数字肯定是小于 t的
                // 连i值都不需要重新设定，直接继续循环即可
            }
        }

        return nagative ? -result : result;
    }
}