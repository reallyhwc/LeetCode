package com.xuhu.LeetCode.easy.easyBefore900.easy824;


class Solution {
    public String toGoatLatin(String S) {
        String[] strings = S.split(" ");
        for(int i = 0; i < strings.length; i++){
            strings[i] = convertString(strings[i],i);
        }
        StringBuffer ans = new StringBuffer();
        for(String s : strings){
            ans.append(s);
            ans.append(' ');
        }
        return ans.deleteCharAt(ans.length()-1).toString();
    }

    private String convertString(String s, int i){
        StringBuffer ans = new StringBuffer();
        ans.append(s);
        char c = s.charAt(0);
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
                c == 'u' || c == 'U'){
            ans.append("ma");
        }else {
            ans.deleteCharAt(0);
            ans.append(c);
            ans.append("ma");
        }
        while (i >= 0){
            ans.append('a');
            i--;
        }
        return ans.toString();
    }
}