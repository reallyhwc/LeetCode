package com.xuhu.LeetCode.easy.easyBefore500.easy0496;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums2.length == 0 || nums1.length == 0){
            return nums1;
        }
        Map<Integer,Integer> map = new HashMap<>(nums2.length * 2);
        Stack<Integer> stack = new Stack<>();
        stack.push(nums2[0]);
        for(int i = 1; i < nums2.length; i++){
            int tempNum = nums2[i];
            while (!stack.isEmpty() && stack.peek() < tempNum){
                map.put(stack.pop(), tempNum);
            }
            stack.push(tempNum);
        }
        while (! stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        for(int i = 0 ; i < nums1.length; i++){
            int num = map.get(nums1[i]);
            nums1[i] = num;
        }
        return nums1;
    }
}