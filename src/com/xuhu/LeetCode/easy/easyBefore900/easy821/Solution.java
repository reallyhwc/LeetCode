package com.xuhu.LeetCode.easy.easyBefore900.easy821;


class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] ans = new int[S.length()];
        for(int i = 0; i < S.length(); i++){
            ans[i] = getMinDistance(S,C,i);
        }
        return ans;
    }

    private int getMinDistance(String s,char c,int index){
        if(index < 0 || index > s.length()){
            return 0;
        }
        if(s.charAt(index) == c) return 0;
        int i = index - 1;
        int j = index + 1;
        while (true){
            if(i >= 0 && s.charAt(i) == c){
                return index-i;
            }
            if(j < s.length() && s.charAt(j) == c){
                return j-index;
            }
            i--;
            j++;
            if(i < 0 && j > s.length()) break;
        }
        return -1;
    }
}