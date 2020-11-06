package com.xuhu.LeetCode.ojEveryDay.Y2020.M11.D05;


import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //
        if(!wordList.contains(endWord)) return 0;
        // 题目说明每个单词一样长
        int len = beginWord.length();

        // 处理给出的单词字典，转换为全部的通用状态及每个通配词映射的单词集合
        HashMap<String, ArrayList<String>> allComboDict = new HashMap<>();
        wordList.forEach(curWord ->{
            for(int i = 0;i <len; i++){
                //
                String comboWord = curWord.substring(0,i)+"*"+curWord.substring(i+1,len);
                ArrayList<String> comboWordList = allComboDict.getOrDefault(comboWord,new ArrayList<>());

                comboWordList.add(curWord);
                // 更新一个通配字典全集中这个通配词对应的单词集合
                allComboDict.put(comboWord, comboWordList);
            }
        });
        //广度优先遍历队列
        Queue<Pair<String,Integer>> queue = new LinkedList<>();
        // 记录已遍历过的单词,为什么不用List，因为之后判断节点是否已遍历过时，ArrayList的contains方法太低效了，它的底层是数组，或者直接用TreeSet也可以
        HashMap<String,Boolean> hasVisitList = new HashMap<>();
        // 开始词作为第一个节点加入队列,深度level是1，标记其已访问
        queue.add(new Pair<>(beginWord,1));

        hasVisitList.put(beginWord,true);
        while (!queue.isEmpty()){
            //队列的第一个节点
            Pair<String,Integer> node = queue.remove();
            String currWord = node.getKey();
            int level = node.getValue();
            for (int i = 0; i < len; i++) {
                // 从当前单词，得到len个通配词
                String currComboWord = currWord.substring(0, i) + "*" + currWord.substring(i + 1, len);
                // 拿到这个通配词映射的单词集合(也就是从当前单词一次转换能得到哪些单词)
                ArrayList<String> currComboWordList = allComboDict.getOrDefault(currComboWord, new ArrayList<>());
                // 遍历其中是否包含目标单词
                for (String word : currComboWordList) {
                    // 包含目标单词，说明当前单词能一次转换到目标单词，经历的步骤数是当前单词的层级 + 1
                    if (word.equals(endWord))
                        return level + 1;
                    // 否则，当前单词能得到这个单词，如果它还没被访问过
                    // if (!hasVistedList.contains(word)){
                    // HashMap.containsKey方法效率远高于ArrayList.contains
                    if (!hasVisitList.containsKey(word)){
                        // 把这个单词加入到队列中
                        queue.add(new Pair<>(word, level + 1));
                        // 标记它为已访问
                        // hasVistedList.add(word);
                        hasVisitList.put(word, true);
                    }
                }
            }
        }
        return 0;
    }

    class Pair<K, V> {
        private K key;
        private V value;

        public K getKey() {
            return key;
        }


        public V getValue() {
            return value;
        }

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }
//
//    private List<String> changeOneLetter(String s, List<String> list){
//        List<String> ans = new ArrayList<>();
//        for(String s1 : list){
//            if(chackLetter(s,s1)){
//                ans.add(s1);
//            }
//        }
//        return list;
//    }
//
//    private boolean chackLetter(String s, String l){
//        if(s == null || l == null) return false;
//        if(s.length() != l.length()) return false;
//        if(s.length() == 1) return true;
//        int num = 0;
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i) != l.charAt(i)){
//                num++;
//                if(num > 1){
//                    return false;
//                }
//            }
//        }
//        return num <= 1;
//    }
}