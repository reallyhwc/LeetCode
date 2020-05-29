package com.xuhu.LeetCode.mid.midBefore200.mid0151;


import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        boolean lastIsEmpty = true;
        int lastIndex = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                if(!lastIsEmpty){
                    stack.push(s.substring(lastIndex,i));
                    lastIsEmpty = true;
                }
                lastIndex = i+1;
            }else {
                lastIsEmpty = false;
            }
        }
        if(!lastIsEmpty){
            stack.add(s.substring(lastIndex,s.length()));
        }
        StringBuffer ans = new StringBuffer();
        while (!stack.isEmpty()){
            ans.append(stack.pop());
            ans.append(" ");
        }
        return ans.length() > 1 ? ans.deleteCharAt(ans.length()-1).toString() : "";
    }
}