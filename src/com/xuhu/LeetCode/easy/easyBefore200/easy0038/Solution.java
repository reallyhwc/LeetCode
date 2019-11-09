package com.xuhu.LeetCode.easy.easyBefore200.easy0038;


class Solution {
    public String countAndSay(int n) {
        return Method(n);
    }

    public String Method(int n){
        //如果是1 则直接返回1
        //如果不是1 则调用read函数，‘读’一下第n-1个字符串形式的数字
        if(n == 1){
            return "1";
        }else{
            return read(Method(n - 1));
        }
    }

    public String read(String str){
        //read函数 通过 StringBuffer 拼接
        StringBuffer stringBuffer = new StringBuffer();
        int tempNum = 1;
        //循环遍历字符串至倒数第二位
        //如果这一位数字与后一位相同，则把临时相同数字个数+1
        //如果不相同，则根据数字个数，拼接字符串
        //最后，也要把最后一个字符处理一下
        //over
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                tempNum++;
            }else{
                stringBuffer.append(tempNum).append(str.charAt(i));
                tempNum=1;
            }
        }
        stringBuffer.append(tempNum).append(str.charAt(str.length() - 1));
        return stringBuffer.toString();
    }
}