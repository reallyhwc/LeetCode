package com.xuhu.LeetCode.mid.midBefore100.mid0005;


class Solution {
    /**
     * 事实上，只需使用恒定的空间，我们就可以在 O(n^2)O(n
     * 2
     *  ) 的时间内解决这个问题。
     *
     * 我们观察到回文中心的两侧互为镜像。因此，回文可以从它的中心展开，并且只有 2n - 12n−1 个这样的中心。
     *
     * 你可能会问，为什么会是 2n - 12n−1 个，而不是 nn 个中心？原因在于所含字母数为偶数的回文的中心可以处于两字母之间（例如 \textrm{“abba”}“abba” 的中心在两个 \textrm{‘b’}‘b’ 之间）。
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring/solution/zui-chang-hui-wen-zi-chuan-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        //计算当前最长回文串的起止下标
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++){
            //计算以当前字母为中心，回文串的最大长度
            int len1 = expandAroundCenter(s,i,i);
            //计算以当前字母和后一个字母为中心（双字母中心） 回文串的最大长度
            int len2 = expandAroundCenter(s,i,i+1);
            //取最大
            int len = Math.max(len1,len2);
            //如果当前计算出来的最大回文串的长度，超过了之前存放的，则更新最长回文串起止下标
            if(len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start,end+1);
    }

    private int expandAroundCenter(String s, int left, int right){
        int L = left;
        int R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}