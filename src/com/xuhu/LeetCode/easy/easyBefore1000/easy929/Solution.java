package com.xuhu.LeetCode.easy.easyBefore1000.easy929;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String str : emails){
            set.add(convertEmails(str));
        }
        return set.size();
    }

    private String convertEmails(String str){
        String yuMing = str.substring(str.indexOf("@"));
        String host = str.substring(0,str.indexOf("@"));
        StringBuffer ans = new StringBuffer();
        for (char c : host.toCharArray()){
            if(c == '.'){
                continue;
            }
            if(c == '+'){
                break;
            }
            ans.append(c);
        }
        ans.append(yuMing);
        return ans.toString();
    }
}