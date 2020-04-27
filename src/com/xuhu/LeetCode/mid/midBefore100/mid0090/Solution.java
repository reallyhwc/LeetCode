package com.xuhu.LeetCode.mid.midBefore100.mid0090;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /**
     * 这个题目的解题思想是这样的。由于nums内的元素存在重复，那么我们必然需要
     * 考虑如果元素重复了，怎么去处理这个元素。最直观的想法是说比如我碰到了
     * nums[i] == nums[i-1]表示当前元素我处理过了，拿题目中的数组举例子
     * nums:[1,2,2]  i=2的时候就满足上式，那么我们可以认为这个元素已经处理过了
     * 就直接跳过吗？ 显然不能 因为如果直接跳过我们就会漏掉[2,2] 和 [1,2,2]
     * 这两个组合。那么说明我们必须找出某种方式，将部分重复的元素去除。
     *
     * 我们仔细思考一下nums[1,2,2] 当i=0的时候由于我们用于存储所有已知集合的
     * retList只含有一个[]元素，那么不存在重复问题，我们经过这一步可以得到
     * retList: [] [1] 来到2的时候我们在看 由于也不存在重复我们的2可以和
     * 之前的retlist中的元素全组合一遍得到retList:[] [1] [2] [1,2]
     * 等i=2来到这个重复的2的时候，我们发现他和前面的元素重复了，那么如果我们
     * 先不考虑重复的问题重复会得到[] [1] [2] [1,2] [2] [1,2] [2,2] [1,2,2]
     * 我们发现[2] [1,2]这部分是重复的部分是需要被踢出的部分 那么我们的目标现在
     * 就转变成了如何鉴别出引起重复的这一部分，然后在组合的时候跳过他们。我们回忆一下
     * 重复的这个[2] [1,2]来源于 2 这个元素和 [] [1] 组合导致的，因为在这个重复的
     * 2之前，已经有一个2和[] [1]发生过组合，所以这里再去组合 必然发生重复现象。
     * 那实际上这个第二次出现的2，只应该和[2] [1,2]发生组合。在这个例子中[2] [1,2]
     * 是两个组合，很容易看出来，但是我们需要一个值，来表示说出现重复时我到底该匹配的值
     * 有多少个？ 这个值就是上一次没有出现重复元素时，retList的长度。这么说太抽象了
     * 我们举个例子 假设我们来到了[] [1] 现在2要和他们进行组合 此时2和1不相同，那么
     * 他应该和整个retList进行组合 需要进行组合的元素数为2.那么当 来到第二个2时，此时
     * retList中有四个元素[] [1] [2] [1,2] 按照刚才我们说的他只可以组合两个元素，
     * 否则必然引起重复，而且是从后往前数两个元素（这个方向是因为，新的组合总是添加在数组的
     * 尾巴上），如果照我们说的 他只应该和[2],[1,2]发生组合最后的出[] [1] [2] [1,2] [2,2] [1,2,2].
     *
     * 接下来说点别的，为什么第二个重复元素只能去和倒数的 上一次没有出现重复元素时，retList的长度个
     * 元素进行组合？
     *
     * 原因是这样的，比如当nums[i] != num[i-1]时，此时nums[i]需要和retList中所有元素进行组合
     * 该过程完成后retList的大小会由原大小m 变化为2m。当我们继续往后走时，当前nums[i] == nums[i-1]
     * 我们直到我们当前的nums[i]只应该和之前的nums[i-1]没处理过的部分，或者之前的nums[i-1]在上一次
     * 组合中新生成的部分进行组合（否则必然造成重复），那这个新生成部分的大小是多少呢？答案是m，因为再不重复时
     * 每一次的组合结束大小都会变为原来的1倍，一半是之前的值，一半是新生成的值，而这个m就是上一次没有出现重复元素时，retList的长度。
     *
     * 以此类推 当我们的nums[1,2,2,2] 当i=3时，这个时候他还是只需要和上一次retList的最后m个元素进行组合
     *
     *
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> listAll = new ArrayList<>();
        listAll.add(new ArrayList<>());
        if(nums == null || nums.length == 0) return listAll;
        Arrays.sort(nums);

        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        listAll.add(temp);
        if(nums.length == 1) return listAll;

        int lastLen = 1;
        for(int i = 1; i < nums.length; i++){
            int size = listAll.size();
            if(nums[i] != nums[i-1]){
                lastLen = size;
            }

            for(int j = size-lastLen; j < size; j++){
                List<Integer> inner = new ArrayList<>(listAll.get(j));
                inner.add(nums[i]);
                listAll.add(inner);
            }
        }

        return listAll;
    }
}