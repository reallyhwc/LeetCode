package com.xuhu.LeetCode.mid.midBefore200.mid0179;


class Solution {
    /**
     * 主要思路-利用快排思想
     * 只不过把快排中比较大小的部分替换掉
     * 对于 123 456 这种 长度相同的数字，正常比较大小即可
     * 对于 32  321 这种数字，如果已经比较完了较短的数字 则后面再比较时则采用首位数字 3
     * 即 32 > 321 = 323 > 321
     * 对于 34  343 这种数字 如果已经比较完了较短的数字 则后面再比较时则采用首位数字与最后一位数字中的最大值 4
     *  34 > 343 = 344 > 343
     *  对于 121 12
     *  121 < 12 = 121 < 122
     *  对于 34 345
     *  34 < 345 = 344 < 345
     *  对于 31 313
     *  31 = 313 -> 313 = 313  但是这个时候需要取长度长的放前面  所以313 > 31
     * @param nums
     * @return
     */
    public String largestNumber(int[] nums) {
        fastSort(nums,0,nums.length-1);
        if(nums[0] == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(int x : nums){
            sb.append(x);
        }
        return sb.toString();
    }

    private void fastSort(int[] nums, int begin, int end){
        if(begin > end){
            return;
        }
        int p = partition(nums,begin,end);
        fastSort(nums,begin,p-1);
        fastSort(nums,p+1,end);
    }

    private int partition(int[] nums, int begin, int end){
        int pivot = nums[end];
        int i = begin;
        for (int j = begin; j < end; j++){
            if(isBigCompare(nums[j],pivot)){
                swap(nums,i,j);
                i++;
            }
        }
        swap(nums,i,end);
        return i;
    }


    private boolean isBigCompare(int a, int b){
        if(a == 0){
            return false;
        }
        if(b == 0){
            return true;
        }

        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        if(s1.length() == s2.length()){
            return a >= b;
        }
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        int i = 0;
        int max = Math.max(s1.length(), s2.length());
        while (i < max){
            char temp1 = i < s1.length() ? s1.charAt(i) : c1;
            char temp2 = i < s2.length() ? s2.charAt(i) : c2;
            if(i == s1.length() - 1){
                c1 = c1 >= s1.charAt(i) ? c1 : s1.charAt(i);
            }
            if(i == s2.length() - 1){
                c2 = c2 >= s2.charAt(i) ? c2 : s2.charAt(i);
            }
            if(temp1 == temp2){
                i++;
                continue;
            }else {
                return temp1 >= temp2;
            }
        }
        return s1.length() >= s2.length();
    }

    private static void swap(int[] arrays, int i, int j){
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }
}