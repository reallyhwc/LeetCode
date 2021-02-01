package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D27;


class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind unionFindA = new UnionFind(n);
        UnionFind unionFindB = new UnionFind(n);
        int res = 0;
        for (int[] edge : edges) {
            if (edge[0] != 3) {
                continue;
            }
            res += unionFindA.union(edge[1], edge[2]);
            unionFindB.union(edge[1], edge[2]);
        }
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                continue;
            }
            if (edge[0] == 1) {
                res += unionFindA.union(edge[1], edge[2]);
            } else {
                res += unionFindB.union(edge[1], edge[2]);
            }
        }

        return (unionFindA.node == 1 && unionFindB.node == 1) ? res : -1;
    }
}

class UnionFind {

    int[] parent;
    int node;

    UnionFind(int n) {
        parent = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            parent[i] = i;
        }
        node = n;
    }

    public int find(int num) {
        if (parent[num] != num) {
            parent[num] = find(parent[num]);
        }
        return parent[num];
    }

    public int union(int i, int j) {
        if (find(i) == find(j)) {
            return 1;
        }
        parent[find(i)] = find(j);
        node--;
        return 0;
    }


}