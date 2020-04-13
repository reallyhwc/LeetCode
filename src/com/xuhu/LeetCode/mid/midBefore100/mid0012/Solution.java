package com.xuhu.LeetCode.mid.midBefore100.mid0012;

class Solution {
    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        String[] strings1 = new String[]{"","M","MM","MMM"};
        String[] strings2 = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] strings3 = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] strings4 = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        if(num >= 1000){
            ans.append(strings1[num/1000]);
            num = num % 1000;
        }
        if(num >= 100){
            ans.append(strings2[num/100]);
            num = num % 100;
        }
        if(num >= 10){
            ans.append(strings3[num/10]);
            num = num % 10;
        }
        ans.append(strings4[num]);
        return ans.toString();
    }
}