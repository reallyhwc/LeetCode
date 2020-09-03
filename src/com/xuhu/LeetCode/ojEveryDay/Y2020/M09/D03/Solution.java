package com.xuhu.LeetCode.ojEveryDay.Y2020.M09.D03;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    String str;
    public List<List<String>> solveNQueens(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append('.');
        }
        str = sb.toString();

        List<List<String>> ansList = new ArrayList<> ();
        backTrace(ansList,new ArrayList<> (),0,n,new HashSet<>(),new HashSet<>(),new HashSet<>(),new HashSet<> ());
        return ansList;

    }

    /**
     * 纯手工酿造，不容易的垃圾代码啊
     * 先这样看看吧，勉强利用了回溯的思想（回溯剪枝法） 分别用四个set 记录每行每列用了啥，先提交后面再优化
     * @param ans
     * @param list
     * @param nowSize
     * @param n
     * @param xSet
     * @param ySet
     * @param zSet
     * @param dSet
     */
    private void backTrace(List<List<String>> ans, List<String> list, int nowSize, int n, Set<Integer> xSet, Set<Integer> ySet, Set<Integer> zSet, Set<Integer> dSet){
        if (nowSize == n){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < n; i++){
            int calculateZ = i - nowSize;
            int calculateD = i + nowSize;
            if (!xSet.contains(i) && !ySet.contains(nowSize) && !zSet.contains(calculateZ) && !dSet.contains(calculateD)){
                xSet.add(i);
                ySet.add(nowSize);
                zSet.add(calculateZ);
                dSet.add(calculateD);


                list.add(getString(i));

                backTrace(ans,list,nowSize+1,n,xSet,ySet,zSet,dSet);

                list.remove(list.size() - 1);

                xSet.remove(i);
                ySet.remove(nowSize);
                zSet.remove(calculateZ);
                dSet.remove(calculateD);
            }
        }
    }

    private String getString(int index){
        return new StringBuilder(str).replace(index,index+1,"Q").toString();
    }
}