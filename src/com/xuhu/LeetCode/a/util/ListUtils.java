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

    public static  void pringlnDoubleArrays(int[][] array){
        for(int[] X : array){
            for(int num : X){
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static  void pringlnList(List list){
        for(Object X : list){
            System.out.println(X);
        }
    }

    public static void printlnStrs(String[] strings){
        for(String str : strings){
            System.out.println(str);
        }
    }
}
