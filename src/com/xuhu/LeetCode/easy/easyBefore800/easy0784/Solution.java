package com.xuhu.LeetCode.easy.easyBefore800.easy0784;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCasePermutation(String S) {
        List<StringBuffer> list = new ArrayList<>();
        list.add(new StringBuffer());

        for(char c : S.toCharArray()){
            int n = list.size();
            if(Character.isLetter(c)){
                for(int i = 0; i < n; i++){
                    list.add(new StringBuffer(list.get(i)));
                    list.get(i).append(Character.toLowerCase(c));
                    list.get(n+i).append(Character.toUpperCase(c));
                }
            }else {
                for(int i = 0; i < n; i++){
                    list.get(i).append(c);
                }
            }
        }

        List<String> result = new ArrayList<>();
        for(StringBuffer stringBuffer : list){
            result.add(stringBuffer.toString());
        }
        return result;
    }
}