package com.xuhu.LeetCode.mid.midBefore100.mid0096;


class Solution {
    //Java: 我真傻，真的，看到二叉搜索树以为是用dfs，然后一看标签是动态规划，最后没想到是个数学题
    //令G(n)表示n个节点二叉排序树的个数，f(i)表示以i作为根节点的二叉排序树的个数
    //因此有：G(n) = f(1)+f(2)+f(3)+...+f(n)
    //以i为根节点的左子树有i-1个节点，因此右子树有G(i-1)种二叉排序树
    //右子树有n-i个节点，因此右子树有G(n-i)种二叉排序树
    //从而得到：f(i) = G(i-1)*G(n-i)
    //最后得到G(n) = G(0)*G(n-1)+G(1)G(n-2)+G(2)G(n-3)+...+G(n-1)G(0)
    public int numTrees(int n) {
        int[] ans = new int[n+1];
        ans[0] = 1;
        ans[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < i; j++){
                ans[i] += ans[j] * ans[i-j-1];
            }
        }
        return ans[n];
    }
}