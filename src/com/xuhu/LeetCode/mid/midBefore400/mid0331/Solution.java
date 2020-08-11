package com.xuhu.LeetCode.mid.midBefore400.mid0331;


import java.util.Stack;

class Solution {

    /**
     * 改进版
     *算法
     *
     * 初始化可用槽位为 1：slots = 1。
     *
     * 遍历前序序列化字符串，每遍历到逗号字符：
     *
     * 空节点和非空节点都消耗一个槽位：slots = slot - 1。
     *
     * 如果当前可用槽位是负数，那么这个先序序列就是非法的，返回 False。
     *
     * 非空节点（即逗号字符前不是 #），新增两个可用槽位：slots = slots + 2`。
     *
     * 最后一个节点需要单独处理，因为最后一个节点后面是没有逗号的。
     *
     * 如果可用槽位全部被消耗完，那么该前序序列化就是合法的：返回 slots == 0。
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/verify-preorder-serialization-of-a-binary-tree/solution/yan-zheng-er-cha-shu-de-qian-xu-xu-lie-hua-by-leet/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param preorder
     * @return
     */
    public boolean isValidSerialization(String preorder) {
        int slots = 1;
        int n = preorder.length();
        for (int i = 0; i < n; i++) {
            if (preorder.charAt(i) == ',') {
                --slots;

                if (slots < 0) {
                    return false;
                }

                if (preorder.charAt(i - 1) != '#') {
                    slots += 2;
                }
            }
        }
        slots = (preorder.charAt(n - 1) == '#') ? slots - 1 : slots + 1;
        return slots == 0;
    }


    /**
     * 单纯的利用栈 时间太长
     *
     * 如果非叶子结点，存入栈
     * 如果栈顶非叶子结点，当前是叶子结点，就存入叶子结点
     * 如果发现两个叶子结点，那么出栈两个叶子结点并把这两个叶子结点的pre替换成叶子结点
     * （表明当前已经处理）
     * @param preorder
     * @return
     */
    public boolean isValidSerialization1(String preorder) {
        String[] strings = preorder.split(",");
        Stack<String> stack = new Stack<>();
        for (String waitPush : strings) {
            if (!waitPush.equals("#")) {
                stack.push(waitPush);
            } else if (!stack.isEmpty() && stack.peek().equals("#")) {
                do {
                    stack.pop();
                    if (stack.isEmpty() || stack.peek().equals("#")) {
                        return false;
                    } else {
                        stack.pop();
                    }
                } while (!stack.isEmpty() && stack.peek().equals("#"));
                stack.push(waitPush);
            } else {
                stack.push(waitPush);
            }
        }
        return stack.isEmpty() || (stack.size() == 1 && stack.peek().equals("#"));
    }
}