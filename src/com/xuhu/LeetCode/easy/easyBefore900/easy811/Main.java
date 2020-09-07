package com.xuhu.LeetCode.easy.easyBefore900.easy811;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        String[] strings = {"9001 discuss.leetcode.com"};
        String[] strings1 = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
//        ListUtils.pringlnList(solution.subdomainVisits(strings));
        ListUtils.printList(solution.subdomainVisits(strings1));
    }
}