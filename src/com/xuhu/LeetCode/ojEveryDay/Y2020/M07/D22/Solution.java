package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D22;


import java.util.Arrays;

class Solution {

    /**
     * 写的头都要炸裂的一个二分居然不如for循环？？？？？？？？？
     * @param numbers
     * @return
     */
    public int minArray(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int n : numbers){
            min = Math.min(min,n);
        }
        return min;
    }

    public int minArray1(int[] numbers) {
        if (numbers == null || numbers.length < 1) {
            return -1;
        }
        if (numbers.length == 1) {
            return numbers[0];
        }
        int left = 0;
        int right = numbers.length - 1;
        if (numbers[left] < numbers[right]){
            return numbers[left];
        }
        while (true) {
            int mid = left + ((right - left)>>1);
            if (mid == left) {
                return Math.min(numbers[left], numbers[right]);
            }
            // 如果符合条件 说明左边半截有序
            if (numbers[left] < numbers[mid]){
                left = mid;
            }else if (numbers[mid] < numbers[right]) {
                right = mid;
            }else {
                return Math.min(minArray(Arrays.copyOfRange(numbers,left,mid+1)),minArray(Arrays.copyOfRange(numbers,mid,right+1)));
            }
        }
    }
}