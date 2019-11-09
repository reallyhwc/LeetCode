package com.xuhu.LeetCode.easyBefore200.easy0013;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int length = s.length();
        for(int i = 0; i < length - 1; i++){
            //循环判断第一个-倒数第二个字符，如果前面一个表示的数字大
            //就加上前面一个数字，如果后面一个表示的数字大，则减去
            int before = map.get(s.charAt(i));
            int after = map.get(s.charAt(i + 1));
            if(before < after){
                result -= before;
            }else{
                result += before;
            }
        }
        //最后一个字符表示的数字则直接加上即可
        result += map.get(s.charAt(length-1));
        return result;
    }
}