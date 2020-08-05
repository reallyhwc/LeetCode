package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D05;


import com.xuhu.LeetCode.a.util.TreeNode;

class Solution {
    public int rob(TreeNode root) {
        int[] result = method(root);
        return Math.max(result[0], result[1]);
    }

    private int[] method(TreeNode root) {
        int[] result = new int[2];
        if (root != null) {
            //获得左右子树结果
            int[] left = method(root.left);
            int[] right = method(root.right);
            // 0 表示不偷根节点   1 表示偷
            result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
            result[1] = left[0] + right[0] + root.val;
        }
        return result;
    }

    /**
     * 时间长到炸裂，做了太多的无序计算 在实现一个版本
     *
     * @param root
     * @return
     */
    public int rob1(TreeNode root) {
        return Math.max(dfs(root, false), dfs(root, true));
    }

    public int dfs(TreeNode root, boolean couldUseRoot) {
        if (root == null) {
            return 0;
        }
        if (couldUseRoot) {
            return Math.max((root.val + dfs(root.left, false) + dfs(root.right, false))
                    , dfs(root.left, true) + dfs(root.right, true));
        } else {
            return dfs(root.left, true) + dfs(root.right, true);
        }
    }
}