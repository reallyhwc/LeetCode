package com.xuhu.LeetCode.easy.easyBefore700.easy682;

import java.util.Stack;

class Solution {
    public int calPoints(String[] ops) {
        int[] result = new int[ops.length];
        int i = 0;
        for(String s : ops){
            switch (s){
                case "+":result[i] = result[i-1] + result[i-2];i++;break;
                case "D":result[i] = 2 * result[i-1];i++;break;
                case "C":result[i-1] = 0;i--;break;
                default:result[i] = Integer.valueOf(s);i++;
            }
        }
        int sum = 0;
        for(int num : result){
            sum += num;
        }
        return sum;
    }
//    public int calPoints(String[] ops) {
//        if(ops == null || ops.length == 0){
//            return 0;
//        }
//        int length = ops.length;
//
//        Stack<Integer> stack = new Stack<>();
//        for(int i = 0; i < length; i++){
//            String s = ops[i];
//            int total = 0;
//            if("+".equals(s)){
//                int top = stack.pop();
//                total = top + stack.peek();
//                stack.push(top);
//                stack.push(total);
//            }else if("D".equals(s)){
//                stack.push(stack.peek() * 2);
//            }else if("C".equals(s)){
//                stack.pop();
//            }else {
//                stack.push(Integer.valueOf(s));
//            }
//        }
//        int result = 0;
//        while (!stack.isEmpty()){
//            result += stack.pop();
//        }
//        return result;
//    }
}