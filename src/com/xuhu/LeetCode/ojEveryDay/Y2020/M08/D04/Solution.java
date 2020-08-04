package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D04;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] beforeCourseNum = new int[numCourses];
        List<List<Integer>> afterCourseList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            afterCourseList.add(new ArrayList<>());
        }
        for (int[] array : prerequisites) {
            beforeCourseNum[array[0]]++;
            afterCourseList.get(array[1]).add(array[0]);
        }
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (beforeCourseNum[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int temp = queue.poll();
                numCourses--;
                for (int course : afterCourseList.get(temp)) {
                    beforeCourseNum[course]--;
                    if (beforeCourseNum[course] == 0) {
                        queue.add(course);
                    }
                }
            }
        }

        return numCourses == 0;
    }
}