package com.xuhu.LeetCode.easy.easyBefore600.easy0551;



class Solution {

    public boolean checkRecord(String s) {
        int aNum = 0;
        int lNum = 0;
        char[] chars = s.toCharArray();
        for(char c : chars){
            if(c == 'L'){
                lNum++;
                if(lNum > 2){
                    return false;
                }
            }else {
                lNum = 0;
                if(c == 'A'){
                    if(aNum >= 1){
                        return false;
                    }else {
                        aNum++;
                    }
                }
            }
        }
        return true;
    }
}