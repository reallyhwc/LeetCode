package com.xuhu.LeetCode.easy.easyBefore900.easy849;


class Solution {
    public int maxDistToClosest(int[] seats) {
        int[] test = new int[seats.length];
//        for(int i = 0; i < seats.length; i++){
//            test[i] = -1;
//        }
        int num = 0;
        for(int i = 0; i < seats.length; i++){
            if(seats[i] == 1){
                test[num++] = i;
            }
        }

        int ans = Math.max(test[0],seats.length - test[num-1]-1);

        for(int i = 0; i < seats.length-1; i++){
            ans = Math.max(ans,(test[i+1]-test[i])/2);
        }

        return ans;
    }
}