package com.xuhu.LeetCode.other.lucong.T20200925;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public int findMinTimes(int[] array, int n){
        // 下标i的数字表示i零件还需要加工的个数
        int[] waitProcessingNum = new int[10];
        // 下标i的数字表示i零件加工还需要等待的次数
        int[] waitProcessingTime = new int[10];
        int totalNum = 0;
        // 填充基础数据 此时所有零件都可以加工
        for (int num : array){
            waitProcessingNum[num]++;
            totalNum++;
        }
        Arrays.fill(waitProcessingTime,0);

        List<Integer> list = new ArrayList<>();
        process(waitProcessingNum,waitProcessingTime,n,totalNum,list);
        return list.size();
    }

    /**
     * 加工函数
     * 每次选举出来 能够加工的零件中  代加工个数最大的一个加工
     * 如果没有就填充-1（表示等待）
     * @param nums 待加工零件数组
     * @param times 待加工零件等待时间数组
     * @param n n
     * @param totalNum 待加工零件总数
     * @param ansList 返回数组
     */
    private void process(int[] nums, int[] times, int n, int totalNum, List<Integer> ansList){
        if (totalNum <= 0){
            return;
        }
        int maxNum = -1;
        int maxNumIndex = -1;
        for (int i = 0; i < 10; i++){
            if (times[i] <= 0 && nums[i] > 0){
                // 表示当前i可以加工 且还存在待加工的
                if (nums[i] > maxNum){
                    maxNum = nums[i];
                    maxNumIndex = i;
                }
            }
        }
        if (maxNum > 0){
            // 表示当前轮次可以加工
            // 返回数组中添加当前轮次加工的下标为  maxNumIndex 的零件
            ansList.add(maxNumIndex);
            nums[maxNumIndex]--;
            times[maxNumIndex] = n+1;
            totalNum--;
        }else {
            ansList.add(-1);
        }
        // 对等待数组中的每条数据-1
        for(int i = 0; i <10; i++){
            times[i]--;
        }
        process(nums,times,n,totalNum,ansList);
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.findMinTimes(new int[]{1,1,1,2,3,3,3},2));
    }
}