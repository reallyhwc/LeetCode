package com.xuhu.LeetCode.mid.midBefore300.mid0300;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLIS(new int[] {
                10,9,2,5,3,7,101,18
        }));
        System.out.println(solution.lengthOfLIS(new int[] {
                2,2
        }));
        System.out.println(solution.lengthOfLIS(new int[] {
                1,3,6,7,9,4,10,5,6
        }));
    }
}