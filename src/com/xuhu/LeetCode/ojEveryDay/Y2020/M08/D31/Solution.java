package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D31;


import java.util.*;

class Solution {

    // 当前已经打开了的房间个数
    int nowOpenRoomNum;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        nowOpenRoomNum = 0;
        // 初始化当前已经打开了的房间个数为0 并从0号放假开始dfs（最开始仅能打开1号房间）
        dfs(rooms,new boolean[rooms.size()],0);
        return nowOpenRoomNum == rooms.size();
    }

    /**
     * dfs函数
     * @param rooms 题意rooms
     * @param hasOpen 当前已经打开了的房间记录数组（布尔类型数组表示）
     * @param nowRoomNum 当前准备打开的房间数
     */
    private void dfs(List<List<Integer>> rooms, boolean[] hasOpen, int nowRoomNum){
        // 如果这个房间之前已经打开了，不执行任何操作
        if (!hasOpen[nowRoomNum]) {
            // 打开房间后，设定已经打开改房间 并给打开房间总个数+1
            hasOpen[nowRoomNum] = true;
            nowOpenRoomNum++;
            // 对于打开了这个房间后获取到的钥匙  依次dfs
            for (int item : rooms.get(nowRoomNum)){
                dfs(rooms,hasOpen,item);
            }
        }
    }

    /**
     * 时间复杂度太高 再来一个版本
     * @param rooms
     * @return
     */
    public boolean canVisitAllRooms1(List<List<Integer>> rooms) {
        int size = rooms.size();
        if (size == 0 || size == 1){
            return true;
        }
        // 定义一个set 存储已经进过的房间
        Set<Integer> set = new HashSet<>();
        // 定义一个queue 存储手上有的还没有去过的房间的钥匙
        Queue<Integer> queue = new LinkedList<>();

        // 把0号房间和0号房间中的钥匙存储到事先定义好的数据中
        set.add(0);
        for (int item : rooms.get(0)){
            if (!set.contains(item)){
                queue.add(item);
            }
        }
        while (!queue.isEmpty()){
            // 取出一个还没有去过的房间的钥匙
            int key = queue.poll();
            // 进入该房间
            set.add(key);
            // 把这个房间中的新钥匙放入队列
            for (int item : rooms.get(key)){
                if (!set.contains(item)){
                    queue.add(item);
                }
            }
        }
        return set.size()  == size;
    }
}