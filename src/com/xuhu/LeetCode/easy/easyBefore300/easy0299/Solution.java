package com.xuhu.LeetCode.easy.easyBefore300.easy0299;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


class Solution {
    /**
     * 我的思路很简单，先遍历一次字符串，如果两个字符串当前索引字符相同，则将"公牛数"加一；
     * 否则，将秘密字符串的字符放入HashMap中，进行次数统计，将猜的字符放入一个Array中。
     * 第一次遍历完毕后进行第二次遍历，此时的array中是猜的字符串中没有对上号的字符，
     * 依次获取array中的字符，看HashMap中是否有该字符，如果有，则让"母牛数"加一，
     * 然后将该字符的次数减一，如果该字符在Map中的次数为零则清除。
     *
     * 作者：janvysun
     * 链接：https://leetcode-cn.com/problems/bulls-and-cows/solution/javaliang-chong-fang-fa-by-janvysun/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public String getHint1(String secret, String guess) {
        int a = 0;
        int b = 0;
        Map<Character,Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < secret.length(); i++){
            char temp = secret.charAt(i);
            if(temp == guess.charAt(i)){
                a++;
            }else {
                list.add(guess.charAt(i));
                if(map.containsKey(temp)){
                    map.put(temp,map.get(temp) + 1);
                }else{
                    map.put(temp,1);
                }
            }
        }
        for(char c : list){
            if(map.containsKey(c)){
                b++;
                map.put(c,map.get(c) - 1);
                if(map.get(c) == 0){
                    map.remove(c);
                }
            }
        }
        return a + "A" + b + "B";
    }


    public String getHint(String secret, String guess) {
        char[] se = secret.toCharArray();
        char[] gu = guess.toCharArray();
        int length = secret.length();
        int a = 0;
        int b = 0;
        int[] m = new int[10];
        int[] n = new int[10];
        for(int i = 0; i < length; i++){
            if(se[i] == gu[i]){
                a++;
            }else{
                m[se[i] - '0']++;
                n[gu[i] - '0']++;
            }
        }

        for(int i = 0; i < 10; i++){
            b+=Math.min(m[i],n[i]);
        }
        return a + "A" + b + "B";
    }
}