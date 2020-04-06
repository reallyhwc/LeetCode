package com.xuhu.LeetCode.easy.easyBefore900.easy859;


class Solution {
    // 保存A中每个字符的个数
    // j,k分别表示A[i]!=B[i]时的第一个i和第二个i
    // flag 表示A中是否存在字符重复
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length()){
            return false;
        }
        int[] nums = new int[26];
        int j = -1;
        int k = -1;
        int c = 0;
        boolean flag = false;
        for(int i = 0; i < A.length(); i++){
            nums[A.charAt(i)-'a']++;
            if(nums[A.charAt(i)-'a'] >= 2) {
                flag = true;
            }
            if(A.charAt(i) != B.charAt(i)){
                c++;
                if(c == 1){
                    j = i;
                }else if (c == 2){
                    k = i;
                }else {
                    return false;
                }
            }
        }
        if(c == 0 && flag){
            return true;
        }
        if(c == 2 ){
            return A.charAt(j)==B.charAt(k) && A.charAt(k)==B.charAt(j);
        }
        return false;
    }
}