package com.xuhu.LeetCode.a.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuhu
 * @date 2019-12-16 19:53
 */
public class ListUtils {

    public static <T> List createListByArray(T[] array){
        List<T> result = new ArrayList<>();
        for(T one : array){
            result.add(one);
        }
        return result;
    }

    public static <T> List<List<T>> createDoubleListByDoubleArray(T[][] arrays){
        List<List<T>> result = new ArrayList<>();
        for(T[] array : arrays){
            result.add(createListByArray(array));
        }
        return result;
    }

    public static  void pringlnArrays(int[] array){
        for(int X : array){
            System.out.print(X + "\t");
        }
        System.out.println();
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
            System.out.print(X + "\t");
        }
        System.out.println();
    }

    public static void printlnStrs(String[] strings){
        for(String str : strings){
            System.out.print(str + "\t");
        }
        System.out.println();
    }

    public static void pringlnBoolean(boolean[] array){
        for(boolean b : array){
            System.out.print(b + "\t");
        }
        System.out.println();
    }

    public static void  printChars(char[] chars){
        for(char c : chars){
            System.out.print(c + "\t");
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
