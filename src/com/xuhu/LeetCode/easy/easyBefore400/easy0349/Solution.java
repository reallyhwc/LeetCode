package com.xuhu.LeetCode.easy.easyBefore400.easy0349;

import java.util.*;

class Solution {
    public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for(int X : nums1){
            set.add(X);
        }
        for(int X : nums2){
            if(set.contains(X)){
                resultSet.add(X);
            }
        }
        int[] array = new int[resultSet.size()];
        int index = 0;
        for(int X : resultSet){
            array[index++] = X;
        }
        return array;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(Integer X : nums1){
            set1.add(X);
        }
        for(Integer X : nums2){
            set2.add(X);
        }
        if(set1.size() < set2.size()){
            return set_intersection(set1,set2);
        }else{
            return set_intersection(set2,set1);
        }
    }

    public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2){
        int[] output = new int[set1.size()];
        int index = 0;
        for(Integer X : set1){
            if(set2.contains(X)){
                output[index++] = X;
            }
        }
        return Arrays.copyOf(output,index);
    }
}