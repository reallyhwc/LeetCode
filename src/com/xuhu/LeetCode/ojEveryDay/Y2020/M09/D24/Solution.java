package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D24;


import com.xuhu.LeetCode.a.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    int last = Integer.MIN_VALUE;
    int num = 0;
    List<Integer> list;
    int maxLength = Integer.MIN_VALUE;
    // 直接想法 中序遍历得到的为 递增序列
    public int[] findMode(TreeNode root) {
        if (root == null){
            return new int[]{};
        }
        list = new ArrayList<>();
        method(root);
        if (num == maxLength){
            list.add(last);
        }else if (num > maxLength){
            maxLength = num;
            list = new ArrayList<>();
            list.add(last);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    private void method(TreeNode root){
        if (root == null){
            return;
        }
        method(root.left);
        if (root.val == last){
            num++;
        }else {
            if (last == Integer.MIN_VALUE){
                maxLength = num;
                list.add(last);
            }else {
                if (num == maxLength){
                    list.add(last);
                }else if (num > maxLength){
                    maxLength = num;
                    list = new ArrayList<>();
                    list.add(last);
                }
            }
            last = root.val;
            num = 1;
        }
        method(root.right);
    }
}