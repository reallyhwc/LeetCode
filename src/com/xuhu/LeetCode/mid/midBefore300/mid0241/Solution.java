package com.xuhu.LeetCode.mid.midBefore300.mid0241;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    private Map<String,List<Integer>> map = new HashMap<>();

    public List<Integer> diffWaysToCompute(String input) {
        if (map.containsKey(input)){
            return map.get(input);
        }
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*'){
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));

                for (int L : left){
                    for (int R : right){
                        if (c == '+'){
                            ans.add(L+R);
                        }else if (c == '-'){
                            ans.add(L-R);
                        }else if (c == '*'){
                            ans.add(L*R);
                        }
                    }
                }
            }
        }

        if (ans.isEmpty()){
            ans.add(Integer.parseInt(input));
        }
        map.put(input,ans);
        return ans;
    }
}