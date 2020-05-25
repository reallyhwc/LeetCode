package com.xuhu.LeetCode.mid.midBefore200.mid0134;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}));
        System.out.println(solution.canCompleteCircuit(new int[]{2,3,4},new int[]{3,4,3}));
        System.out.println(solution.canCompleteCircuit(new int[]{3,3,4},new int[]{3,4,4}));
    }
}