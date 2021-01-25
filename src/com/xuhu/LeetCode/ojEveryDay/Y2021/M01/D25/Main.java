package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D25;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.regionsBySlashes(new String[]{" /","/ "}));
        System.out.println(solution.regionsBySlashes(new String[]{" \\  ","\\\\\\\\", " \\\\ ", " \\\\ \\"}));
    }
}