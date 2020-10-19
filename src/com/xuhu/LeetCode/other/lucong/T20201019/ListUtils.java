package com.xuhu.LeetCode.other.lucong.T20201019;

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

    public static  void printList(List list){
        for(Object X : list){
            System.out.print(X + "\t");
        }
        System.out.println();
    }

    public static  void printLnList(List list){
        for(Object X : list){
            System.out.print(X + "\n");
        }
        System.out.println();
    }

    public static void printStrs(String[] strings){
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
            printList(list);
            System.out.print("---------------------\n");
        }
    }

    public static <T> void printLnLnLists(List<List<T>> lists){
        for(List list : lists){
            printLnList(list);
            System.out.print("---------------------\n");
        }
    }
}
