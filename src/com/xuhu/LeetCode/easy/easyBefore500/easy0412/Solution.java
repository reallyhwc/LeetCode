package com.xuhu.LeetCode.easy.easyBefore500.easy0412;


import java.util.ArrayList;
import java.util.List;

class Solution {

    List<String> list = new ArrayList<>();

    public List<String> fizzBuzz(int n) {
        int num = 0;
        while (n > 15){
            method(num,15,false);
            num++;
            n -= 15;
        }
        method(num,n,true);
        return list;
    }
    private void method(int num, int times, boolean end){
        int addNum = 15 * num;
        for(int i = 1; end ? i <= times : i <= 15; i++){
            if( i % 3 != 0 && i % 5 != 0){
                list.add(i+addNum+"");
                continue;
            }
            if(i == 3 || i == 6 || i == 9 || i == 12){
                list.add("Fizz");
                continue;
            }
            if(i == 5 || i == 10){
                list.add("Buzz");
                continue;
            }
            list.add("FizzBuzz");
        }
    }
}