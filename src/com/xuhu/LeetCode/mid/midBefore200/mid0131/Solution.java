package com.xuhu.LeetCode.mid.midBefore200.mid0131;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> listAll = new ArrayList<>();
        dfs(s,0,new ArrayList<String>(),listAll);
        return listAll;
    }

    private void dfs(String s, int start, ArrayList<String> path, List<List<String>> listAll){
        if(start == s.length()){
            listAll.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < s.length(); i++){
            String s1 = s.substring(start,i+1);
            if(!isPalindrome(s1)){
                continue;
            }
            path.add(s1);
            dfs(s,i+1,path,listAll);
            path.remove(path.size()-1);
        }
    }


    private boolean isPalindrome(String s){
        if(s == null || s.length() <= 1){
            return true;
        }
        int begin = 0;
        int end = s.length()-1;
        while (begin < end){
            if(s.charAt(begin) != s.charAt(end)){
                return false;
            }else {
                begin++;
                end--;
            }
        }

        return true;
    }
}