package com.xuhu.LeetCode.mid.midBefore400.mid0306;


class Solution {
    public boolean isAdditiveNumber(String num) {
        if (num == null) {
            return false;
        }
        int length = num.length();
        // 如果数组长度小于三，那么说明凑不成题意 false
        if (length < 3){
            return false;
        }
        // 这个for循环的意义在于，从nums头中寻找出来合适的两个数用作 执行后面的回溯算法
        for (int j = 1; j <= length / 2; j++){
            for (int k = j+1; k < length; k++){
                // 这边用作循环掐点 反复尝试 0-j j-k 这两个数是否能经历回溯
                // 因为一旦确定头部两个数，那么后面的校验是如何进行的也是一目了然的
                if (backTrace(num,0,j,k)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean backTrace (String s, int i, int j, int k){
        // 经典回溯算法
        // 目的就在于，截取出s中  i-j   j-k的数并计算和
        // 如果截取出来的数开头为0 且长度大于1 (存在截取的数字为0 的情况，这种情况属于边界情况，符合题意) 返回false
        if (s.charAt(i) == '0' && j - i > 1 || s.charAt(j) == '0' && k - j > 1){
            return false;
        }
        // 通过自己写的一个方法，把截取出来的两个数字累加成字符串格式
        String sum = addNum(s.substring(i,j),s.substring(j,k));
        // 如果累计和的长度超长（比s字符串剩下的一撮都要长那么也没必要继续计算了，直接返回false即可）
        // 如果累计和跟字符串后面一撮不相等（特殊情况下可能会计算偏差如10之类的） 那也直接返回false
        if (sum.length() > s.length() - k || !sum.equals(s.substring(k,k+sum.length()))){
            return false;
        }
        // 走到这里来了，说明能满足上面的条件，如果sum的长度跟s剩下的一撮相等，那么说明走到尾部了，都是符合条件的，返回true
        if (sum.length() == s.length() - k){
            return true;
        }
        // 走到这里说明都符合条件，但是呢，s字符串还没走完，需要继续往下回溯
        // 递归回溯，传参则需注意，三个下标掐出来的就是前两个数
        // 经典的回溯剪枝
        return backTrace(s,j,k,k+sum.length());
    }

    /**
     * 特大数字符串相加运算法
     * @param a a
     * @param b b
     * @return ans
     */
    private String addNum(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int aLen = charsA.length;
        int bLen = charsB.length;
        int temp = 0;
        for (int i = 1; i <= Math.max(aLen, bLen); i++) {
            int numA = i <= aLen ? charsA[aLen - i] - '0' : 0;
            int numB = i <= bLen ? charsB[bLen - i] - '0' : 0;
            int nowSum = numA + numB + temp;
            sb.append(nowSum % 10);
            temp = nowSum / 10;
        }
        if (temp != 0) {
            sb.append(temp);
        }
        return sb.reverse().toString();
    }
}