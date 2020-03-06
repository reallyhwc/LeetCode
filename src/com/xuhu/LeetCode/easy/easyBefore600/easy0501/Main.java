package com.xuhu.LeetCode.easy.easyBefore600.easy0501;

import com.xuhu.LeetCode.a.util.CreateBinaryTreeByArray;
import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Integer[] arrays = {1,null,2,null,null,2};
        ListUtils.pringlnArrays(solution.findMode(CreateBinaryTreeByArray.createBinaryTreeByArray(arrays,0)));
    }
}