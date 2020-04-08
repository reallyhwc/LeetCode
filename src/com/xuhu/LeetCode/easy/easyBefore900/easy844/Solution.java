package com.xuhu.LeetCode.easy.easyBefore900.easy844;


import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        return isSameString(convertString(S), convertString(T));
    }

    public String convertString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        StringBuffer ans = new StringBuffer();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }

    public boolean isSameString(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int length = a.length();
        if (length == 0) return true;

        for (int i = 0; i < length; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}