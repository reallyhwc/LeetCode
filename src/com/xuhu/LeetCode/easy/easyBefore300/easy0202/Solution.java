package com.xuhu.LeetCode.easy.easyBefore300.easy0202;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        int sum = Method(n);
        Map<Integer,Integer> map = new HashMap<>();
        map.put(n,n);
        //对于每次计算后的数填充进 map中，一旦map中出现了重复的数字，则代表进入了一个循环，直接跳出
        //当然，与N相同也是
        while (sum != 1 &&!map.containsKey(sum)){
            map.put(sum,sum);
            sum = Method(sum);
        }
        if(sum == 1){
            return true;
        }else{
            return false;
        }
    }


    /**
     * 该函数用作计算平方数
     * @param n n
     * @return 每位数的平方数之和
     */
    public int Method(int n){
        int result = 0;
        while(n > 9){
            int temp = n % 10;
            n /= 10;
            result += (temp * temp);
        }
        result += (n * n);
        return result;
    }
}