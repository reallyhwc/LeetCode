package com.xuhu.LeetCode.mid.midBefore100.mid0071;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String simplifyPath(String path) {
        List<String> list = new ArrayList<>();
        String[] paths = path.split("/");
        for(String s : paths){
            if(s.equals(".")){
                continue;
            }else if(s.equals("..")){
                if(!list.isEmpty()){
                    list.remove(list.size() - 1);
                }
            }else if(!s.equals("")){
                list.add(s);
            }
        }
        return "/" + String.join("/",list);
    }
}