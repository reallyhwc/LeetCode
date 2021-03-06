package com.xuhu.LeetCode.mid.midBefore300.mid0287;


class Solution {
    public int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (true){
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (fast == slow){
                fast = 0;
                while (fast != slow){
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return slow;
            }
        }
    }
}