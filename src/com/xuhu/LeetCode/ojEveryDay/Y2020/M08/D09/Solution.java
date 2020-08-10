package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D09;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        if (s == null || s.length() < 4) {
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        method(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void method(String s, int index, List<String> nowList, List<String> ans) {
        int maxLength = (4 - nowList.size()) * 3;
        if (s.length() - index > maxLength) {
            return;
        }
        if (nowList.size() == 4 && s.length() == index) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < nowList.size(); i++) {
                if (i != 0) {
                    sb.append('.');
                }
                sb.append(nowList.get(i));
            }
            ans.add(sb.toString());
            return;
        }

        for (int i = index + 1; i <= index + 3 && i <= s.length(); i++) {
            String ip = s.substring(index, i);
            if (Integer.parseInt(ip) > 255) {
                continue;
            }
            if (ip.length() > 1 && '0' == ip.charAt(0)) {
                continue;
            }
            nowList.add(ip);
            method(s, i, nowList, ans);
            nowList.remove(nowList.size() - 1);
        }

    }
}