package com.xuhu.LeetCode.easy.easyBefore300.easy02683;


/**
 * 参考
 * 执行用时 : 1 ms, 在Move Zeroes的Java提交中击败了97.26% 的用户
 * 内存消耗 : 39.7 MB, 在Move Zeroes的Java提交中击败了77.33% 的用户
 *
 * 采用双指针的方法，一个指针i用于遍历数组，另一个指针j用于指向0的位置，每次在需要交换的时候交换nums[i]和nums[j]的值然后令j+1，这样只需要考虑两种情况
 *
 * 当nums[i]=0 并且nums[j]!=0，此时令j=i，让j指向0所在的位置以方便交换
 * 当nums[i]!=0 并且nums[j]==0，此时将交换值并令j+1以指向下一个元素
 * 实现的java代码如下
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        for(; i < nums.length; i++){
            if(nums[i] == 0 && nums[j] != 0){
                j = i;
            }
            if(nums[i] != 0 && nums[j] == 0){
                nums[j++] = nums[i];
                nums[i] = 0;
            }
        }
    }
}