package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D10;


class Solution {
    public boolean lemonadeChange(int[] bills) {
        // 柠檬水找零
        int fiveNum = 0;
        int tenNum = 0;
        for (int bill : bills){
            if (bill == 5){
                fiveNum++;
            }else if (bill == 10){
                tenNum++;
                if (fiveNum <= 0){
                    return false;
                }
                fiveNum--;
            }else if (bill == 20){
                if (tenNum > 0){
                    tenNum--;
                    if (fiveNum <= 0){
                        return false;
                    }
                    fiveNum--;
                }else {
                    if (fiveNum < 3){
                        return false;
                    }
                    fiveNum -= 3;
                }
            }
        }
        return true;
    }
}