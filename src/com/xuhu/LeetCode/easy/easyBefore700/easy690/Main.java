package com.xuhu.LeetCode.easy.easyBefore700.easy690;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();

        List<Employee> list = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.importance = 5;
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        employee1.subordinates = list1;
        list.add(employee1);

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.importance = 3;
        List<Integer> list2 = new ArrayList<>();
        employee2.subordinates = list2;
        list.add(employee2);

        Employee employee3 = new Employee();
        employee3.id = 3;
        employee3.importance = 3;
        List<Integer> list3 = new ArrayList<>();
        employee3.subordinates = list3;
        list.add(employee3);

        System.out.println(solution.getImportance(list,1));
    }
}