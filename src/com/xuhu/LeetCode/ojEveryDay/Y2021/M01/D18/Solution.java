package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D18;

import java.util.*;

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> emailToIndex = new HashMap<> ();
        Map<String, String> emailToName = new HashMap<> ();

        // 给每个email 赋予一个index下标及 email -> 对应的name
        int emailIndex = 0;
        for (List<String> account : accounts){
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++){
                String email = account.get(i);
                if (!emailToIndex.containsKey(email)){
                    emailToIndex.put(email, emailIndex++);
                    emailToName.put(email, name);
                }
            }
        }

        // 构建一下email index之间的并查集
        UnionFind unionFind = new UnionFind(emailIndex);
        for (List<String> account : accounts){
            // 构建规则，把能够关联到一起去的email -> index  构建成并查集
            int firstIndex = emailToIndex.get(account.get(1));
            for (int i = 2; i < account.size(); i++){
                unionFind.union(firstIndex, emailToIndex.get(account.get(i)));
            }
        }

        // 构建一个顶层parentIndex 和 emailList之间的映射
        Map<Integer, List<String>> indexToEmail = new HashMap<>();
        emailToIndex.keySet().stream().forEach(s -> {
            Integer index = unionFind.find(emailToIndex.get(s));
            List<String> list = indexToEmail.getOrDefault(index, new ArrayList<> ());
            list.add(s);
            indexToEmail.put(index, list);
        });

        // 填充转换成返回值
        List<List<String>> ans = new ArrayList<> ();
        for (List<String> list : indexToEmail.values()){
            Collections.sort(list);
            String name = emailToName.get(list.get(0));
            List<String> tempList = new ArrayList<> ();
            tempList.add(name);
            tempList.addAll(list);
            ans.add(tempList);
        }
        return ans;
    }
}

class UnionFind{

    private int[] parent;

    /**
     * 构建并查集
     * @param n n
     */
    UnionFind(int n){
        // 初始化数组
        parent = new int[n];
        // 并将每个结点的parent设置为自己
        // 道理： 每个节点总可以抵达自己自身吧？
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    void union(int index1, int index2){
        // 构建2结点之间的并查
        // 核心要素：设定index2 的最顶层的parent 的parent = index1 的最顶层parent 前后交换也不影响
        parent[find(index2)] = find(index1);
    }

    public int find(int num){
        // 寻找结点的parent
        // 如果num ！= parent
        // 可以设定为parent = parent的parent 循环到底
        // 如果相等，则说明没有parent 返回自身即可
        if (parent[num] != num){
            parent[num] = find(parent[num]);
        }
        return parent[num];
    }
}