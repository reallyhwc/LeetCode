package com.xuhu.LeetCode.game.autumn.T03;


import java.util.Arrays;

class Solution {

    // 还是参加的比赛少了 复盘一下  在半小时左右的时候，就应该想到使用DP来解决问题
    // 但是反而放弃了使用DP来暴力搜，暴力搜也就罢了，居然好像还做错了？
    // 应该在最开始就想到使用DP来处理，DP的状态方程转移也需要考虑清楚

    /*
    参看别人的思路 异常简单
    动态规划

使用 3 个 dp 数组记录状态

dp[0][i] 代表从头开始全部修改成红色（纯红）需要修改几次
dp[1][i] 代表从头开始是红色，然后现在是黄色（红黄），需要修改几次
dp[2][i] 代表从头开始是红色，然后变成黄色，又变成红色（红黄红），需要修改几次
根据 i 是红是黄，判断转移情况

dp[0][i] 就很简单，如果是黄的，就比之前加一
dp[1][i] 可以从上一个纯红状态变化过来，也可以从上一个本身状态变化过来
dp[2][i] 可以从上一个红黄状态变化过来，也可以从上一个本身状态变化过来
所以最后要求的答案即：dp[2].back()

作者：ikaruga
链接：https://leetcode-cn.com/problems/UlBDOe/solution/ulbdoe-by-ikaruga/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */

    public int minimumOperations(String leaves) {
        if (null == leaves || leaves.length() <= 2){
            return -1;
        }
        int length = leaves.length();
        int dp[][] = new int[3][length];
        dp[0][0] = leaves.charAt(0) == 'y' ? 1 : 0;
        for (int i = 1; i < length; i++) {
            dp[0][i] = dp[0][i-1] + (leaves.charAt(i) == 'y' ? 1 : 0);
            dp[1][i] = dp[0][i-1] + (leaves.charAt(i) == 'r' ? 1 : 0);
            if (i > 1){
                dp[1][i] = Math.min(dp[1][i], dp[1][i-1] + (leaves.charAt(i) == 'r' ? 1 : 0));
                dp[2][i] = dp[1][i-1] + (leaves.charAt(i) == 'y' ? 1 : 0);
            }
            if (i > 2){
                dp[2][i] = Math.min(dp[2][i], dp[2][i-1] + (leaves.charAt(i) == 'y' ? 1 : 0));
            }
        }
        return dp[2][length-1];
    }


    /**
     * 小调整之后，CPU超时很多，但是没有测试错的！....
     * @param leaves
     * @return
     */
    public int minimumOperations1(String leaves) {
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
            return (chars[begin] == 'y' ? 0 : 1) + ans;
        }
        if (begin > end){
            return -1;
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