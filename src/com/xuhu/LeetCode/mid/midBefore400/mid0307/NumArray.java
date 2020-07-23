package com.xuhu.LeetCode.mid.midBefore400.mid0307;

/**
 * @author xuhu
 * @date 2020-07-22 19:36
 */
class NumArray {

    private int[] tree;
    private int length;

    public NumArray(int[] nums) {
        length = nums.length;
        tree = new int[length * 2];
        buildTree(nums);
    }

    private void buildTree(int[] nums) {
        for (int i = length; i < 2*length; i++){
            tree[i] = nums[i-length];
        }
        for (int i = length-1; i > 0; i--){
            tree[i] = tree[2*i] + tree[2*i+1];
        }
    }

    public void update(int i, int val) {
        i += length;
        tree[i] = val;
        while (i > 0){
            int left = i;
            int right = i;
            if(i % 2 == 0){
                right = i+1;
            }else {
                left = i - 1;
            }
            tree[i/2] = tree[left] + tree[right];
            i /= 2;
        }
    }

    public int sumRange(int i, int j) {
            i += length;
        j += length;
        int sum = 0;
        while (i <= j){
            if ((i % 2) == 1){
                sum += tree[i];
                i++;
            }
            if ((j % 2) == 0){
                sum += tree[j];
                j--;
            }
            i /= 2;
            j /= 2;
        }
        return sum;
    }
}