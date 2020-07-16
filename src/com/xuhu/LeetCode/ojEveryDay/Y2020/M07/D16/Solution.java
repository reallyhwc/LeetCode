package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D16;


class Solution {
    // 染色法dfs  单色染色  整个函数返回true的条件就是 每条边的两个点都需要属于A色orB色，只能有两种颜色且每条边上的点都必须颜色不同
    public boolean isBipartite(int[][] graph) {
        int set[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++){
            // 遍历，对于每个点进行染色
            // 如果非0 表示这个节点已经被染色了，跳过
            if (set[i] != 0){
                continue;
            }
            // 如果给这个节点dfs染A 色或者B 色都失败了（+1   -1 表示）
            if (!dfs(graph,i,1,set) && !dfs(graph,i,-1,set)) {
                // 那么返回失败
                return false;
            }

        }
        return true;
    }

    private boolean dfs (int[][] graph, int node, int mark, int set[]){
        // 如果这个节点没有被染色，先给他染色
        if (set[node] == 0){
            set[node] = mark;
        }else {
            // 如果已经被染色了，返回当前颜色和待染色是否相同，相同为true-等于不用再染了
            // 不同为false
            return set[node] == mark;
        }
        // 走到这里，说明当前节点之前并没有被染过色
        // 现在对所有的跟这个节点相连的结点染上另外一种颜色
        for (int i : graph[node]){
            // 如果有失败的，则视作当前节点未染色并返回当前dfs染色失败
            if (!dfs(graph, i, -mark, set)){
                set[i] = 0;
                return false;
            }
        }
        return true;
    }
}