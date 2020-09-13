package com.xuhu.LeetCode.game.autumn.T03;



class Solution {
    public int minimumOperations(String leaves) {
        if (leaves == null || leaves.length() <= 2){
            return -1;
        }
        char[] chars = leaves.toCharArray();
        int length = leaves.length();
        int ans = 0;
        if (chars[0] == 'y'){
            ans++;
            chars[0] = 'r';
        }
        if (chars[length - 1] == 'y'){
            ans++;
            chars[length - 1] = 'r';
        }
        int begin = 0;
        int end = length - 1;
        while (begin < end){
            if (chars[begin] == 'r' && chars[end] == 'r'){
                begin++;
                end--;
            }else if (chars[begin] =='r'){
                begin++;
            }else if (chars[end] == 'r'){
                end--;
            }else {
                break;
            }
        }
        if (begin == end){
            return (chars[begin] == 'y' ? 0 : 1);
        }
        if (begin > end){
            return 1;
        }

        int[] rNum = new int[length];
        rNum[0] = 1;
        for (int i = 1; i < length; i++) {
            rNum[i] = (rNum[i-1] + (chars[i] == 'r' ? 1 : 0));
        }
        ans += method(rNum,begin,end,chars);
        return ans;
    }

    private int method(int[] rNum, int begin, int end, char[] chars){
        while (begin < end){
            if (chars[begin] == 'r'){
                begin++;
            }else if (chars[end] == 'r'){
                end--;
            }else {
                break;
            }
        }
        if (begin == end){
            return chars[begin] == 'y' ? 0 : 1;
        }

        int changeRNum = rNum[end] - rNum[begin];
        if (changeRNum == 0){
            return 0;
        }

        int leftChange = 1 + method(rNum,begin+1,end,chars);
        int rightChange = 1 + method(rNum,begin,end-1,chars);

        return Math.min(changeRNum,Math.min(leftChange,rightChange));
    }
}