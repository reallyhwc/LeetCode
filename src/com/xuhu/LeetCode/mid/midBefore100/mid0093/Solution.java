package com.xuhu.LeetCode.mid.midBefore100.mid0093;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        if(s == null || s.length() < 4) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        method(s,0,new ArrayList<>(),result);
        return result;
    }

    private void method(String s, int index, List<String> list, List<String> result){
        // 预期结果能有的最大长度  最多能有4格 每格三位 list是已占有的格式
        int maxLength = (4 - list.size()) * 3;
        // 如果原字符串剩余字符大于预期最大长度 则不符合要求，返回
        if(s.length() - index > maxLength) return;

        // 满足条件
        if(list.size() == 4 && s.length() == index){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 4; i++){
                if(i == 0){
                    sb.append(list.get(i));
                }else {
                    sb.append(".").append(list.get(i));
                }
            }
            result.add(sb.toString());
            return;
        }

        for(int i = index + 1; i <= index + 3 && i <= s.length(); i++){
            String ip = s.substring(index,i);
            //大于255 不符合ip规则
            if(Integer.parseInt(ip) > 255) continue;
            //大于1位数 且不能以0 为开头
            if(ip.length() > 1 && '0' == ip.charAt(0)) continue;

            list.add(ip);
            method(s,i,list,result);
            list.remove(list.size()-1);
        }
    }
}