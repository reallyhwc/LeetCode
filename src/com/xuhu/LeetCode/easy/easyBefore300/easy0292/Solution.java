package com.xuhu.LeetCode.easy.easyBefore300.easy0292;


//其实是一个简单意义上的数学问题
//理解题意后会比较清晰
//只要我拿了一次之后，保证剩下的石头的个数是4的倍数的情况
//就可以保证自己可以赢 否则，如果初始就是4的倍数，不论如何都得拿1-3个石头，就输定了
class Solution {
    public boolean canWinNim(int n) {
        if(n < 0){
            return false;
        }
        if(n % 4 == 0){
            return false;
        }
        return true;
    }
}