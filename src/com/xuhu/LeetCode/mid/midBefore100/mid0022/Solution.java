package com.xuhu.LeetCode.mid.midBefore100.mid0022;


import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> list;
    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        dfs(n,0,0,"");
        return list;
    }

    private void dfs(int N, int left, int right, String s){
        if(left > N || right > N || right > left){
            return;
        }
        if(N == left && N == right){
            list.add(s);
            return;
        }
        dfs(N,left+1,right,s+"(");
        dfs(N,left,right+1,s+")");
    }
}