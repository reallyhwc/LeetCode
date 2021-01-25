package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D25;


class Solution {
    public int regionsBySlashes(String[] grid) {
        // 整体思路 一个格子要么正斜杠要么反斜杠要么没有斜杠，等效可以将一个格子分成四块来考虑
        // 通过这四块格子之间的关系，构建并查集即可
        int len = grid.length;
        int size = len * len * 4;
        UnionFind unionFind = new UnionFind(size);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int start = 4 * (i * len + j);
                switch (grid[i].charAt(j)) {
                    case ' ':
                        unionFind.union(start, start + 1);
                        unionFind.union(start + 1, start + 2);
                        unionFind.union(start + 2, start + 3);
                        break;
                    case '/':
                        unionFind.union(start, start + 3);
                        unionFind.union(start + 1, start + 2);
                        break;
                    case '\\':
                        unionFind.union(start, start + 1);
                        unionFind.union(start + 2, start + 3);
                        break;
                }
                if (i > 0) {
                    unionFind.union(start, start - 4 * len + 2);
                }
                if (j > 0) {
                    unionFind.union(start + 3, start - 3);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < size; i++) {
            if (unionFind.find(i) == i) {
                ans++;
            }
        }
        return ans;
    }
}

class UnionFind {
    int[] parent;

    UnionFind(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    void union(int i, int j) {
        parent[find(j)] = find(i);
    }

    int find(int num) {
        if (parent[num] != num) {
            parent[num] = find(parent[num]);
        }
        return parent[num];
    }
}