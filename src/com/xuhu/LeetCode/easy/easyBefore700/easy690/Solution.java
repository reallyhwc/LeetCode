package com.xuhu.LeetCode.easy.easyBefore700.easy690;


import java.util.*;

/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer,Employee> map = new HashMap<>();
        for(Employee employee : employees){
            map.put(employee.id, employee);
        }
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(id);
        while (!queue.isEmpty()){
            int tempID = queue.poll();
            if(map.containsKey(tempID)){
                Employee employee = map.get(tempID);
                result += employee.importance;
                if(employee.subordinates != null && employee.subordinates.size() != 0){
                    for(Integer I : employee.subordinates){
                        queue.add(I);
                    }
                }
            }
        }
        return result;
    }
}