package com.xuhu.LeetCode.ojEveryDay.Y2021.Test;

/**
 * @author XuHu
 * @date 2021/9/6 7:54 下午
 * @Desc
 */
public class RegularSulution {

    public static boolean regular(/*源字符串*/String source,/*目标字符串*/String target) {
        int slength = source.length();
        int tlength = target.length();
        //用以记录第源字符串前i个字符和目标字符串前j个字符是否匹配
        boolean[][] result = new boolean[slength + 1][tlength + 1];
        //前0个字符串必定相同，因为空字符串的情况下必定相等
        result[0][0] = true;
        for (int i = 0; i <= slength; i++) {
            for (int j = 1; j <= tlength; j++) {
                //如果不是* 号，则先判断两字符是否相等
                if (target.charAt(j - 1) != '*') {
                    if (isMatch(source, target, i, j)) {
                        //相等时，前面的字符都匹配了才是匹配
                        result[i][j] = result[i - 1][j - 1];
                    }
                } else {
                    //如果是*号,则需要判断第i个字符和第j-1是否匹配
                    if (isMatch(source, target, i, j - 1)) {
                        result[i][j] = result[i][j - 2] || result[i-1][j];
                    } else {
                        // 无法匹配 则认为 * 之前的那个字符用0个
                        result[i][j] = result[i][j - 2];
                    }
                }
            }
        }
        return result[slength][tlength];
    }


    /**
     * TODO:
     * 判断源字符串第i个字符和目标字符串第j个字符是否匹配,如果i是0，则直接返回false
     * 其中j>0
     *
     * @param source
     * @param target
     * @param i      第i个，下标是i-1
     * @param j      第j个，下标是j-1
     * @return
     */
    public static boolean isMatch(String source, String target, int i, int j) {
        if (i == 0){
            return false;
        }
        if (target.charAt(j-1) == '.') {
            return true;
        }
        return source.charAt(i-1) == target.charAt(j-1);
    }


    public static void main(String[] args) {
        System.out.println(regular("aa", "a"));
        System.out.println(regular("aa", "a*"));
        System.out.println(regular("mississssssssippi", "mis*is*i*ppi"));
    }

}
