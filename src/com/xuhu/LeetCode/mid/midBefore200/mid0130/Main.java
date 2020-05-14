package com.xuhu.LeetCode.mid.midBefore200.mid0130;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        char[][] chars = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        solution.solve(chars);
        ListUtils.printCharsChars(chars);
    }
}