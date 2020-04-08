package com.xuhu.LeetCode.easy.easyBefore900.easy860;


class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveNUM = 0;
        int tenNUM = 0;
        for(int bill : bills){
            if(bill == 5){
                fiveNUM++;
            }else if(bill == 10){
                if(fiveNUM <= 0){
                    return false;
                }else {
                    fiveNUM--;
                    tenNUM++;
                }
            }else if(bill == 20){
                if(tenNUM >= 1){
                    if(fiveNUM >= 1){
                        fiveNUM--;
                        tenNUM--;
                    }else {
                        return false;
                    }
                }else {
                    if(fiveNUM < 3){
                        return false;
                    }else {
                        fiveNUM -= 3;
                    }
                }
            }
        }

        return true;
    }
}