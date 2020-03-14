package com.xuhu.LeetCode.easy.easyBefore700.easy690;

import java.util.List;

/**
 * @author xuhu
 * @date 2020-03-14 18:49
 */
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};