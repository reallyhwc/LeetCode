package com.xuhu.LeetCode.mid.midBefore300.mid0210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 方法与T207一致
 * 先采用一种方法done一下看搞不搞得出来
 *
 * 把数据存放了之后，用队列存放当前可以直接上的课程
 * 一个一个上然后再往队列后面+新的当前可以直接上的
 * 直到队列为空  如果还有未上的课，说明上不完，返回空数组
 * 否则返回上课顺序的List
 *
 */
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

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