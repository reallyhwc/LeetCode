package com.xuhu.LeetCode.ojEveryDay.Y2020.M12.D24;


class Solution {
    /**
     * 依据前面总结的规律，我们可以提出本题的解法。我们从左到右枚举每一个同学，记前一个同学分得的糖果数量为 \textit{pre}pre：
     *
     * 如果当前同学比上一个同学评分高，说明我们就在最近的递增序列中，直接分配给该同学 \textit{pre} + 1pre+1 个糖果即可。
     *
     * 否则我们就在一个递减序列中，我们直接分配给当前同学一个糖果，并把该同学所在的递减序列中所有的同学都再多分配一个糖果，以保证糖果数量还是满足条件。
     *
     * 我们无需显式地额外分配糖果，只需要记录当前的递减序列长度，即可知道需要额外分配的糖果数量。
     *
     * 同时注意当当前的递减序列长度和上一个递增序列等长时，需要把最近的递增序列的最后一个同学也并进递减序列中。
     *
     * 这样，我们只要记录当前递减序列的长度 \textit{dec}dec，最近的递增序列的长度 \textit{inc}inc 和前一个同学分得的糖果数量 \textit{pre}pre 即可。
     *
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/candy/solution/fen-fa-tang-guo-by-leetcode-solution-f01p/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param ratings r
     * @return i
     */
    public int candy(int[] ratings) {
        int n = ratings.length;
        // 答案(如果仅有一人，发一个糖就好了)
        int ret = 1;
        // inc 表示最长递增序列
        // dec 表示当前最长递减序列
        int inc = 1, dec = 0, pre = 1;
        for (int i = 1; i < n; i++) {
            if (ratings[i] >= ratings[i - 1]) {
                dec = 0;
                pre = ratings[i] == ratings[i - 1] ? 1 : pre + 1;
                ret += pre;
                inc = pre;
            } else {
                dec++;
                if (dec == inc) {
                    dec++;
                }
                ret += dec;
                pre = 1;
            }
        }
        return ret;
    }
}