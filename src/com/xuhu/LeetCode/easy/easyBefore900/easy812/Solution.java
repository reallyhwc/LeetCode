package com.xuhu.LeetCode.easy.easyBefore900.easy812;


class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;

        double ans = 0;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    int x1=points[i][0],y1=points[i][1];
                    int x2=points[j][0],y2=points[j][1];
                    int x3=points[k][0],y3=points[k][1];
                    ans = Math.max(ans,Math.abs((0.5)*(x1*y2+x2*y3+x3*y1-x1*y3-x2*y1-x3*y2)));
                }
            }
        }
        return ans;
    }
}