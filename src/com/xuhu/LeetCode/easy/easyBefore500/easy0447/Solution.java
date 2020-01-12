package com.xuhu.LeetCode.easy.easyBefore500.easy0447;


import java.util.HashMap;

class Solution {
    /**
     *
     * JAVA 实现： 这道题思路其实也比较简单，计算一点和其他点之间的距离，
     * 使用哈希表存储，若同一距离出现多次，则可以形成回旋镖。
     * 假设同一距离出现 n 次，由数字规律可推出回旋镖的数量 sum = n*(n-1) 。
     * 本人开始只能做到存储到哈希表，然后按该公式累加得到最后结果。
     * 参考了速度第一的答案，优化如下：假设当前同一距离的数量为 n,
     * 回旋镖数量为 n*(n-1), 当再出现一个同一距离时，回旋镖的数量应为 (n+1)*n，
     * 与之前相差 (n+1)*n - n*(n-1) = 2*n， 所以只需要把最后答案加上 2*n,
     * 最后 n+1 再存储到哈希表中。
     *
     * @param points
     * @return
     */
    public int numberOfBoomerangs(int[][] points) {
        int length = points.length;
        int ans = 0;
        HashMap<Double,Integer> map = new HashMap<>();
        for(int i = 0;  i < length; i++){
            for(int j = 0; j < length; j++){
                if(i != j){
                    double gis = Math.pow(points[i][0] - points[j][0],2)
                            + Math.pow(points[i][1] - points[j][1], 2);
                    if(!map.containsKey(gis)){
                        map.put(gis, 1);
                    }else {
                        int n = map.get(gis);
                        ans += 2 * n;
                        map.put(gis,n + 1);
                    }
                }
            }
            map.clear();
        }
        return  ans;
    }
}