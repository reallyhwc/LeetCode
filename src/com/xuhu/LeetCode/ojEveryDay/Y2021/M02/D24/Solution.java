package com.xuhu.LeetCode.ojEveryDay.Y2021.M02.D24;


class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] array : A){
            reverse(array);
            convert(array);
        }
        return A;
    }

    public void reverse(int[] array){
        int i = 0;
        int j = array.length - 1;
        while (i < j){
            swap(array, i, j);
            i++;
            j--;
        }
    }

    private void convert(int[] array){
        int i = 0;
        while (i < array.length){
            array[i] = 1 - array[i];
            i++;
        }
    }

    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}