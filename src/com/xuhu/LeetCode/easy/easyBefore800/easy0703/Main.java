package com.xuhu.LeetCode.easy.easyBefore800.easy0703;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        int k = 2;
        int[] arr = {4,5,8,2};
        KthLargest kthLargest = new KthLargest(3,arr);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
}