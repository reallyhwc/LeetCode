package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D29;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.minimalSteps(new String[]{"S#O", "M..", "M.T"}));
        System.out.println(solution.minimalSteps(new String[]{"S#O", "M.#", "M.T"}));
        System.out.println(solution.minimalSteps(new String[]{"S#O", "M.T", "M.."}));
    }
}