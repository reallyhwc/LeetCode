package com.xuhu.LeetCode.mid.midBefore300.mid0207;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    /**
     *
     * 深度优先遍历
     * 根据DFS判断图中是否存在环
     * 借助一个标记array 标记当前节点的状态
     *      0 未访问
     *      1 已被当前节点启动的DFS访问
     *      -1 已被其他节点启动的DFS访问
     *
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 存放数据
        List<List<Integer>> beDepended = new ArrayList<>();
        // 初始化存放数据
        for (int i = 0; i < numCourses; i++){
            beDepended.add(new ArrayList<>());
        }
        int[] flags = new int[numCourses];

        // 填充存放数据的值
        for (int[] item : prerequisites) {
            beDepended.get(item[1]).add(item[0]);
        }
        // 对每个课程执行DFS
        for (int i = 0; i < numCourses; i++){
            if(!dfs(beDepended,flags,i)){
                return false;
            }
        }
        return true;
    }

    private  boolean dfs(List<List<Integer>> lists, int[] flag, int i){
        // 说明在本轮启动的DFS中当前节点属于第二次被访问 说明产生了环路，返回false
        if(flag[i] == 1) return false;
        // 说明当前节点已经被非本轮启动的DFS访问，直接返回true
        if(flag[i] == -1) return true;
        // 执行到这里说明当前节点之前并没有被访问 设定他被访问了
        flag[i] = 1;
        for(Integer integer : lists.get(i)){
            if(!dfs(lists,flag,integer)){
                return false;
            }
        }
        // 当前节点的DFS已经执行完毕，设定当前结点flag值为-1 （flag[i] 再被访问到时已经是归属于其他节点启动的DFS了）
        flag[i] = -1;
        return true;
    }


    /**
     * 这里使用广度优先遍历  并采用入度表来存放数据
     * 主要思路
     *      存放数据 1 使用一个array 存放每个课程的前提课程数（即学习当前课程前需要学习的课程数）（从图的角度来看待就是存放结点的入度）
     *              2 使用一个双层List 存放每个课程所被依赖的课程List 即 学 2 3 前需要学1  那么1的List中存放2 3
     *      操作：
     *              1 遍历塞入所有入度为0的课程 - 即 可以直接上的课程（放入队列中）
     *              2 只要队列中能取出值，则循环取出 当前可以直接上的课程（无依赖课程or依赖课程均已上完）
     *              3 根据当前可以直接上的课程 取出这个课程被依赖的课程List （等效于 把这个课先上掉 并把课程总数-1  -> 已经被上掉了）
     *              4 对于List中的每个课程 前提课程数-1（如果-1后前提课程数为0 添加进可以直接上的课程的队列）
     *              5 循环234 直到队列为空
     *
     *              6 返回当前还未上的课程数是否为0
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public boolean canFinish1(int numCourses, int[][] prerequisites) {
        // 存放数据1
        int[] beforeCourseNums = new int[numCourses];
        // 存放数据2
        List<List<Integer>> beDepended = new ArrayList<>();
        // 初始化存放数据2
        for (int i = 0; i < numCourses; i++){
            beDepended.add(new ArrayList<>());
        }
        // 填充数据1 2 的值
        for (int[] item : prerequisites) {
            beforeCourseNums[item[0]]++;
            beDepended.get(item[1]).add(item[0]);
        }
        // 创建队列 并把 当前可以学习的课程（入度为0）添加进队列中去
        Queue<Integer> couldStudy = new LinkedList<>();
        for (int i = 0; i < numCourses; i++){
            if (beforeCourseNums[i] == 0){
                couldStudy.add(i);
            }
        }
        // 只要队列不为空-循环注释中的步骤234
        while (!couldStudy.isEmpty()){
            int courseNum = couldStudy.poll();
            numCourses--;
            for (int item : beDepended.get(courseNum)){
                if(--beforeCourseNums[item] == 0){
                    couldStudy.add(item);
                }
            }
        }

        return numCourses == 0;
    }
}