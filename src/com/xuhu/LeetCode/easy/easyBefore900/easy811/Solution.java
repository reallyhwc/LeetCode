package com.xuhu.LeetCode.easy.easyBefore900.easy811;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private Map<String, Integer> map;
    public List<String> subdomainVisits(String[] cpdomains) {
        map = new HashMap<>();
        for(String s : cpdomains){
            convertS(s);
        }
        List<String> list = new ArrayList<>();

        for(String string : map.keySet()){
            StringBuffer sb = new StringBuffer();
            sb.append(map.get(string));
            sb.append(" ");
            sb.append(string);
            list.add(sb.toString());
        }
        return list;
    }

    private void convertS(String s){
        int num = Integer.parseInt(s.substring(0,s.indexOf(" ")));
        List<String> list = new ArrayList<>();
        String str = s.substring(s.indexOf(" ")+1,s.length());
        list.add(str);
        while (str.indexOf('.') >= 0){
            str = str.substring(str.indexOf('.')+1,str.length());
            if(null != str && str.length() > 0){
                list.add(str);
            }
        }
        for(String s1 : list){
            map.put(s1,map.getOrDefault(s1,0) + num);
        }
    }
}