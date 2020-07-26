package com.xuhu.LeetCode.ojEveryDay.Y2020.M07.D26;


import java.util.LinkedList;
import java.util.Queue;

class Solution {

    private int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};


    public int longestIncreasingPath(int[][] matrix) {
        if (null == matrix || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int x = matrix.length;
        int y = matrix[0].length;
        int[][] cache = new int[x][y];
        int ans = 0;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++) {
                // 比较经典的一个带备忘录的DFS算法
                ans = Math.max(ans,dfs(matrix,cache,i,j));
            }
        }
        return ans;
    }

    private int dfs (int[][] matrix, int[][] cache, int i, int j){
        // 对于每个进来的 i j 点进行dfs
        // 如果已经被read过了，直接返回cache中的值即可
        if (cache[i][j] != 0){
            return cache[i][j];
        }
        // 通过遍历这个点四周的点 来找出周边的点能够dfs延伸出去的最长只
        if (i-1 >= 0 && matrix[i-1][j] > matrix[i][j]){
            cache[i][j]  = Math.max(cache[i][j],dfs(matrix,cache,i-1,j));
        }
        if (i + 1 < matrix.length && matrix[i+1][j] > matrix[i][j]){
            cache[i][j] = Math.max(cache[i][j],dfs(matrix,cache,i+1,j));
        }
        if (j -1 >= 0 && matrix[i][j-1] > matrix[i][j]){
            cache[i][j] = Math.max(cache[i][j], dfs(matrix, cache, i, j-1));
        }
        if (j + 1 < matrix[0].length && matrix[i][j+1] > matrix[i][j]){
            cache[i][j] = Math.max(cache[i][j], dfs(matrix, cache, i, j+1));
        }
        // 加一的目的是，上面的统计的是求出来的周边的点的最长延伸距离 本身自己也算一个点 +1
        return ++cache[i][j];
    }

    /**
     * 以下代码的主要思想是利用有向图中的拓扑排序算法
     * 每次从出度为0的点开始往后寻找 并调整这个点四周的点的出度（等效于我们读取了这个点的状态之后
     * 移除了这个点）
     * 然后一层层的往下走
     * @param matrix
     * @return
     */
    public int longestIncreasingPath1(int[][] matrix) {
        if (null == matrix || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int x = matrix.length;
        int y = matrix[0].length;

        int[][] outDegrees = new int[x][y];
        // 这个for循环主要是为了统计一下 每个点周围比它大的数有多少（以图的形式来理解就是 出度）
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int[] dir : dirs){
                    int newX = i+dir[0];
                    int newY = j+dir[1];
                    if (newX >= 0 && newX < x && newY >= 0 && newY < y && matrix[newX][newY] > matrix[i][j]){
                        ++outDegrees[i][j];
                    }
                }
            }
        }

        // 这里把出度为0 的点挖出来  目的在于 如果有终点的话，终点必然在这几个点中间
        // 从这些点出发倒着寻找
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++) {
                if (outDegrees[i][j]  == 0){
                    queue.offer(new int[]{i,j});
                }
            }
        }

        int ans = 0;
        while (!queue.isEmpty()){
            ans++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int nowX = cell[0];
                int nowY = cell[1];
                for (int[] dir : dirs){
                    int newX = nowX + dir[0];
                    int newY = nowY + dir[1];
                    if (newX >= 0 && newX < x && newY >= 0 && newY < y && matrix[newX][newY] < matrix[nowX][nowY]){
                        --outDegrees[newX][newY];
                        if (outDegrees[newX][newY] == 0){
                            queue.offer(new int[]{newX,newY});
                        }
                    }
                }
            }
        }
        return ans;


    }
}