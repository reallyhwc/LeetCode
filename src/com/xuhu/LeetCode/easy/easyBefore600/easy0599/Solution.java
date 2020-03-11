package com.xuhu.LeetCode.easy.easyBefore600.easy0599;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            String str = list1[i];
            map.put(str,i);
        }
        int minValue = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < list2.length; i++){
            String str = list2[i];
            if(map.containsKey(str)){
                if((i + map.get(str)) == minValue){
                    list.add(str);
                }else if((i + map.get(str)) < minValue){
                    minValue = (i + map.get(str));
                    list.clear();
                    list.add(str);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}