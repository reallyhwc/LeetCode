package com.xuhu.LeetCode.mid.midBefore200.mid0187;


import java.util.*;

class Solution {

    /*

    本质上本题目采用的方法 都是采取的哈希分片法判断是否重复
    简单的做法就是依次截取字符串，放入HashSet中，使用系统自带的hash算法
    升级版本做法就是，使用Rabin-Karp 旋转哈希实现常数级别的窗口切片
    即 ，可以在常数时间内把上一片的hash值计算成这一片的hash值（相对简单做法可以省去截取字符串，利用系统）

     */

    /**
     * 尝试新的方法
     * @param s
     * @return
     */
    public List<String> findRepeatedDnaSequences(String s) {
        int L = 10;
        int length = s.length();
        if (length <= L){
            return new ArrayList<>();
        }

        // 旋转哈希参数
        int a = 4;
        // aL = a 的L次方
        int aL = (int)Math.pow(a,L);

        Map<Character,Integer> toInt = new HashMap<Character, Integer>(){{put('A',0);put('C',1);put('G',2);put('T',3);}};
        int[] nums = new int[length];
        for (int i = 0; i < length; i++){
            nums[i] = toInt.get(s.charAt(i));
        }

        int h = 0;
        Set<Integer> seen = new HashSet<>();
        Set<String> output = new HashSet<>();

        for (int start = 0; start < length - L + 1; start++){
            if (start != 0){
                h = h * a - nums[start - 1] * aL + nums[start + L - 1];
            }else {
                for (int i = 0; i < L; i++){
                    h = h * a + nums[i];
                }
            }
            if (seen.contains(h)){
                output.add(s.substring(start,start+L));
            }else {
                seen.add(h);
            }
        }
        return new ArrayList<>(output);
    }

    // 这种方法呢  没啥可说的，遍历截取放入set中，如果再放的时候存在，那么说明之前也存在过这种DNA序列，放入结果set
    public List<String> findRepeatedDnaSequences1(String s) {
        int L = 10;
        int length = s.length();
        HashSet<String> set = new HashSet<>();
        HashSet<String> output = new HashSet<>();
        for(int i = 0; i < length - L + 1; i++){
            String str = s.substring(i,i+L);
            if(set.contains(str)){
                output.add(str);
            }else {
                set.add(str);
            }
        }
        return new ArrayList<>(output);
    }
}