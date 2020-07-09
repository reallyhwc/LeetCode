package com.xuhu.LeetCode.mid.midBefore300.mid0227;


import java.util.Stack;

class Solution {
    public int calculate(String s) {
        int res = 0;
        int d = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= '0'){
                // 由ASCII 码表可以得出  加减乘除的值都小于 '0'
                d = d * 10 - '0' + s.charAt(i);
            }
            if ((s.charAt(i) < '0' && s.charAt(i) != ' ') || i == s.length() - 1){
                // 属于操作符
                if (sign == '+'){
                    stack.push(d);
                }else if (sign == '-'){
                    stack.push(-d);
                }else if (sign == '*' || sign == '/'){
                    int temp = sign == '*' ? stack.peek() * d : stack.peek() / d;
                    stack.pop();
                    stack.push(temp);
                }

                sign = s.charAt(i);
                d = 0;
            }
        }
        while (!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }
}