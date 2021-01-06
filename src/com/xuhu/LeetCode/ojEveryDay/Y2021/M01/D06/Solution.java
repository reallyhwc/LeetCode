package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D06;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // 通过 Floyd 算法，先生成邻接矩阵，然后再通过直接查询邻接矩阵得出答案即可

        // 先遍历整个的字符串，得出下标
        int count = 0;
        Map<String, Integer> mapIndex = new HashMap<>();
        for (List<String> list : equations){
            for (String s : list){
                if (!mapIndex.containsKey(s)){
                    mapIndex.put(s, count++);
                }
            }
        }

        double[][] matrix = new double[count+1][count+1];


        // 赋予初始化的值
        for (String s : mapIndex.keySet()){
            int x = mapIndex.get(s);
            matrix[x][x] = 1.0;
        }

        // 构建邻接矩阵
        for (int i = 0; i < queries.size(); i++){
            List<String> list = queries.get(i);
            int index1 = mapIndex.get(list.get(0));
            int index2 = mapIndex.get(list.get(1));
            double val = values[i];
            matrix[index1][index2] = val;
            matrix[index2][index1] = 1 / val;
        }

        int n = count + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    if (j == k || matrix[j][k] != 0) continue;
                    if (matrix[j][i] != 0 && matrix[i][k] != 0){
                        matrix[j][k] = matrix[j][i] * matrix[i][k];
                    }
                }
            }
        }

        // 计算结果值
        double[] ans = new double[queries.size()];
        int index = 0;
        for (List<String> list : queries){
            if (mapIndex.containsKey(list.get(0))&& mapIndex.containsKey(list.get(1))){
                ans[index++] = matrix[mapIndex.get(list.get(0))][mapIndex.get(list.get(1))] == 0 ? -1 : matrix[mapIndex.get(list.get(0))][mapIndex.get(list.get(1))];
            }else {
                ans[index++] = -1;
            }
        }


        return ans;
    }
}