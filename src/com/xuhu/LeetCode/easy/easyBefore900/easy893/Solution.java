package com.xuhu.LeetCode.easy.easyBefore900.easy893;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for(String S : A){
            int[] count = new int[52];
            for(int i = 0; i < S.length(); i++){
                count[S.charAt(i)-'a' + 26 * (i%2)]++;
            }
            set.add(Arrays.toString(count));
        }
        return set.size();
    }
}