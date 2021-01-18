package com.xuhu.LeetCode.ojEveryDay.Y2021.M01.D18;

import java.util.*;

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> emailToIndex = new HashMap<> ();
        Map<String, String> emailToName = new HashMap<> ();

        // 给每个email 赋予一个index下标及 email - 对应的name
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
            int firstIndex = emailToIndex.get(account.get(1));
            for (int i = 2; i < account.size(); i++){
                unionFind.union(firstIndex, emailToIndex.get(account.get(i)));
            }
        }

        // 构建一个index 和 emailList之间的映射
        Map<Integer, List<String>> indexToEmail = new HashMap<>();
        emailToIndex.keySet().stream().forEach(s -> {
            Integer index = unionFind.find(emailToIndex.get(s));
            List<String> list = indexToEmail.getOrDefault(index, new ArrayList<> ());
            list.add(s);
            indexToEmail.put(index, list);
        });

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

    public UnionFind(int n){
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void union(int index1, int index2){
        parent[find(index2)] = find(index1);
    }

    public int find(int num){
        if (parent[num] != num){
            parent[num] = find(parent[num]);
        }
        return parent[num];
    }
}