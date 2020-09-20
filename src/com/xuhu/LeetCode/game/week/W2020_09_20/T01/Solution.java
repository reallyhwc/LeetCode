package com.xuhu.LeetCode.game.week.W2020_09_20.T01;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reorderSpaces(String text) {
        List<String> list = new ArrayList<>();
        int spaceNum = 0;
        boolean lastIsChar = false;
        int wordBeginIndex = -1;
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '){
                if(lastIsChar){
                    list.add(text.substring(wordBeginIndex,i));
                    lastIsChar = false;
                }
                spaceNum++;
            }else {
                if (!lastIsChar){
                    lastIsChar = true;
                    wordBeginIndex = i;
                }
            }
        }
        if (lastIsChar){
            list.add(text.substring(wordBeginIndex));
        }
        if (list.size() == 1){
            return list.get(0) + getSpaceWord(spaceNum);
        }

        StringBuffer sb = new StringBuffer();
        int wordSpaceNum = spaceNum / (list.size()-1);
        String str = getSpaceWord(wordSpaceNum);
        for (int i = 0; i < list.size()-1; i++) {
            sb.append(list.get(i)).append(str);
        }
        sb.append(list.get(list.size() - 1)).append(getSpaceWord(spaceNum % (list.size()-1)));


        return sb.toString();
    }

    private String getSpaceWord(int num){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}