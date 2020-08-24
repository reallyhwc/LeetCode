package com.xuhu.LeetCode.ojEveryDay.Y2020.M08.D24;


class Solution {
    /**
     * 假设给定字符串s可由一个子串x重复n次构成，
     * 即s=nx。 现构造新字符串t=2s，即两个s相加，由于s=nx，则t=2nx。
     * 去掉t的开头与结尾两位，则这两处的子串被破坏掉，此时t中包含2n-2个子串。
     * 由于t中包含2n-2个子串，s中包含n个子串，若t中包含s，则有2n-2>=n，可得n>=2，
     * 由此我们可知字符串s可由一个子串x重复至少2次构成，判定为true；反之，若t中不包含s，
     * 则有2n-2<n，可得n<2，n只能为1，由此我们可知字符串s=x，假定的子串就为s本身，判定为false。
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        str = str.substring(1,str.length() - 1);
        return str.indexOf(s) >= 0;
    }
}