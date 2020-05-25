package com.xuhu.LeetCode.mid.midBefore200.mid0134;


class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int length = gas.length;
        int totalTank = 0;
        int currTank = 0;
        int startingStation = 0;
        for(int i = 0; i < length; i++){
            totalTank += gas[i]-cost[i];
            currTank += gas[i]-cost[i];
            if(currTank < 0){
                startingStation = i+1;
                currTank = 0;
            }
        }
        return totalTank >= 0 ? startingStation : -1;
    }


//    public int canCompleteCircuit(int[] gas, int[] cost) {
//        int length = gas.length;
//        for(int i = 0; i < length; i++){
//            if(gas[i] < cost[i]){
//                continue;
//            }else {
//                if(method(i,i+1,length,gas[i]-cost[i],gas,cost)){
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//
//    private boolean method(int begin, int nowIndex, int length, int nowGas, int[] gas, int[] cost){
//        if(nowIndex == begin){
//            return true;
//        }
//        if(nowIndex >= length){
//            nowIndex = (nowIndex % length);
//        }
//
//        nowGas += gas[nowIndex];
//        nowGas -= cost[nowIndex];
//        if(nowGas < 0) return false;
//        return method(begin,(nowIndex+1)%length,length,nowGas,gas,cost);
//    }
}