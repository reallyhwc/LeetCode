package com.xuhu.LeetCode.mid.midBefore100.mid0079;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        char[][] chars = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(solution.exist(chars,"ABCCED"));
        System.out.println(solution.exist(chars,"SEE"));
        System.out.println(solution.exist(chars,"ABCB"));
    }
}