package com.xuhu.LeetCode.easy.easyBefore600.easy0599;

import com.xuhu.LeetCode.a.util.ListUtils;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        String[] a1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] a2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        ListUtils.printStrs(solution.findRestaurant(a1,a2));
    }
}