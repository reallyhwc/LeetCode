package com.xuhu.LeetCode.mid.midBefore300.mid0210;

import java.util.*;

/**
 * 方法与T207一致
 * 先采用一种方法done一下看搞不搞得出来(还不错，时间80%+)
 *
 * 广度优先遍历
 * 把数据存放了之后，用队列存放当前可以直接上的课程
 * 一个一个上然后再往队列后面+新的当前可以直接上的
 * 直到队列为空  如果还有未上的课，说明上不完，返回空数组
 * 否则返回上课顺序的List
 *
 */
class Solution {

    /**
     * DFS 深度优先遍历
     *
     * // 黑人问号脸？ 为啥DFS还要慢一点，我写错了么？
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // 老方法 先存放数据
        int[] nums = new int[numCourses];

        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            lists.add(new ArrayList<>());
        }

        for (int[] item : prerequisites){
            nums[item[0]]++;
            lists.get(item[1]).add(item[0]);
        }

        // 标记数组
        int[] flag = new int[numCourses];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < numCourses; i++){
            if(!DFS(i,lists,flag,ans)){
                return new int[0];
            }
        }
        Collections.reverse(ans);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean DFS(int nowCourse, List<List<Integer>> lists, int[] flag, List<Integer> ans){
        if(flag[nowCourse] == 1){
            // 本次dfs启动的搜索第二次访问到 故返回false（相当于产生了环）
            return false;
        }
        if(flag[nowCourse] == -1){
            // 被其他节点启动的DFS访问到了
            return true;
        }
        flag[nowCourse] = 1;
        for (int temp : lists.get(nowCourse)){
            if(!DFS(temp,lists,flag,ans)){
                return false;
            }
        }
        flag[nowCourse] = -1;
        ans.add(nowCourse);
        return true;
    }


    /**
     * 广度优先遍历法
     * @param numCourses
     * @param prerequisites
     * @return
     */
    public int[] findOrder1(int numCourses, int[][] prerequisites) {

        int[] nums = new int[numCourses];

        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            lists.add(new ArrayList<>());
        }

        for (int[] item : prerequisites){
            nums[item[0]]++;
            lists.get(item[1]).add(item[0]);
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++){
            if (nums[i] == 0){
                queue.add(i);
            }
        }

        int[] ans = new int[numCourses];
        int index = 0;

        while (!queue.isEmpty()){
            int temp = queue.poll();
            ans[index++] = temp;
            numCourses--;
            for (int tempClass : lists.get(temp)){
                if(--nums[tempClass] == 0){
                    queue.add(tempClass);
                }
            }
        }

        return numCourses == 0 ? ans : new int[0];
    }
}