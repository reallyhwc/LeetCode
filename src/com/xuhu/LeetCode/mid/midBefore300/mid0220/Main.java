package com.xuhu.LeetCode.mid.midBefore300.mid0220;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyAlmostDuplicate(new int[]{1,2,3,1},3,0));
        System.out.println(solution.containsNearbyAlmostDuplicate(new int[]{1,0,1,1},1,2));
        System.out.println(solution.containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9},2,3));
    }
}