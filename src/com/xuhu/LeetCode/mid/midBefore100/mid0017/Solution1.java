package com.xuhu.LeetCode.mid.midBefore100.mid0017;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuhu
 * @date 2020-04-14 10:22
 */
public class Solution1 {
    String[] letter_map = {" ","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0) return res;
        dfs(digits,0,"");
        return res;
    }

    private void dfs(String digists, int index, String s){
        if(index == digists.length()){
            res.add(s);
            return;
        }
        String s1 = letter_map[digists.charAt(index) - '0'];

        for(Character c : s1.toCharArray()){
            dfs(digists,index + 1, s + c);
        }
    }
}
