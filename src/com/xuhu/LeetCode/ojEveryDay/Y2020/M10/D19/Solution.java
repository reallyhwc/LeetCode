package com.xuhu.LeetCode.ojEveryDay.Y2020.M10.D19;


import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        return getRealString(S).equals(getRealString(T));
    }

    private String getRealString(String s){
        if (s == null || s.length() == 0) {
            return s;
        }
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character> ();
        for (char c : chars){
            if (c == '#'){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}