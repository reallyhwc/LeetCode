package com.xuhu.LeetCode.easy.easyBefore700.easy605;


import com.xuhu.LeetCode.a.util.ListUtils;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean canPlaceFlowers_longTime(int[] flowerbed, int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for(int num : flowerbed){
            list.add(num);
        }
        list.add(0);
        int nowZero = 0;
        int ans = 0;
        for(int num : list){
            if(num == 0){
                nowZero++;
                if(nowZero == 3){
                    nowZero = 1;
                    ans++;
                }
            }else {
                nowZero = 0;
            }
        }
        return n <= ans;
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int cnt = 0;
        for(int i = 0; i < length; i++){
            if(flowerbed[i] == 1) continue;
            int before = i == 0 ? 0 : flowerbed[i-1];
            int next = i == length - 1 ? 0 : flowerbed[i+1];
            if(before == 0 && next == 0){
                cnt++;
                flowerbed[i] = 1;
            }
        }
        return cnt >= n;
    }
}