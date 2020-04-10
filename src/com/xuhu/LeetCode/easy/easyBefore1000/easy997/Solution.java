package com.xuhu.LeetCode.easy.easyBefore1000.easy997;


import java.util.HashMap;
import java.util.Map;

class Solution {

    public int findJudge(int N, int[][] trust) {
        if(N == 1){
            return 1;
        }
        int[] trusteds = new int[N+1];
        int[] beTrust = new int[N+1];
        for(int[] X : trust){
            trusteds[X[0]]++;
            beTrust[X[1]]++;
        }

        for(int i = 0; i < N+1; i++){
            if(beTrust[i] == N-1 && trusteds[i] == 0){
                return i;
            }
        }
        return -1;
    }

    public int findJudge1(int N, int[][] trust) {
        if(N == 1){
            return 1;
        }
        //某人信任他人的次数
        Map<Integer,Integer> trusts = new HashMap<>(N * 2);
        //某人被他人信任的次数
        Map<Integer,Integer> beTrust = new HashMap<>(N * 2);
        for(int[] X : trust){
            trusts.put(X[0],trusts.getOrDefault(X[0],0)+1);
            beTrust.put(X[1],beTrust.getOrDefault(X[1],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : beTrust.entrySet()){
            if(entry.getValue() == N-1){
                if(!trusts.containsKey(entry.getKey())){
                    return entry.getKey();
                }
            }
        }
        return -1;

    }
}