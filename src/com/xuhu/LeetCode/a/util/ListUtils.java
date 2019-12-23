package com.xuhu.LeetCode.a.util;

import java.util.List;

/**
 * @author xuhu
 * @date 2019-12-16 19:53
 */
public class ListUtils {

    public static  void pringlnArrays(int[] array){
        for(int X : array){
            System.out.println(X);
        }
    }

    public static  void pringlnList(List list){
        for(Object X : list){
            System.out.println(X);
        }
    }
}
