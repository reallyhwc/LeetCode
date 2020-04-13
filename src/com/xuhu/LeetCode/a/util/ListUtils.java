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

    public static void pringlnBoolean(boolean[] array){
        for(boolean b : array){
            System.out.println(b);
        }
    }

    public static void  printChars(char[] chars){
        for(char c : chars){
            System.out.print(c + '\t');
        }
        System.out.println();
    }

    public static void printCharsChars(char[][] charsChars){
        for(char[] chars : charsChars){
            printChars(chars);
        }
    }

    public static <T> void printLnLists(List<List<T>> lists){
        for(List list : lists){
            pringlnList(list);
            System.out.print("---------------------\n");
        }
    }
}
