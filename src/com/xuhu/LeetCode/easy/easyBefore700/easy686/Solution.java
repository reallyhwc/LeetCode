package com.xuhu.LeetCode.easy.easyBefore700.easy686;


class Solution {

    public int repeatedStringMatch(String A, String B) {
        StringBuilder str = new StringBuilder();
        str.append(A);
        int lenA = A.length();
        int lenB = B.length();
        int len = lenA;
        while (len < lenB){
            str.append(A);
            len += lenA;
        }

        int i = len / lenA;
        if(str.lastIndexOf(B) != -1) return i;
        str.append(A);
        if(str.lastIndexOf(B) != -1) return i + 1;
        return -1;
    }

    public int repeatedStringMatch_toMuchTime2(String A, String B) {
        if(A.length() >= B.length()){
            if(isIndexOf(A,B)) return 1;
            if(isIndexOf(A+A,B)) return 2;
            return -1;
        }
        String s = A;
        int count = 1;
        int maxCount = (B.length() % A.length() == 0) ? B.length() / A.length() + 1 : B.length() / A.length() + 2;
        while (count <= maxCount){
            if(isIndexOf(s,B)){
                return count;
            }else {
                count++;
                s = s+A;
            }
        }
        return -1;
    }

    private boolean isIndexOf(String A,String B){
        return !(A.indexOf(B) == -1);
    }

    public int repeatedStringMatch_toMuchTime(String A, String B) {
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) == B.charAt(0)){
                int aIndex = i;
                int j = 0;
                int count = 1;
                while (j < B.length() && A.charAt(aIndex) == B.charAt(j)){
                    if(aIndex + 1 >= A.length()){
                        aIndex = 0;
                        count++;
                    }else {
                        aIndex++;
                    }
                    j++;
                }
                if(aIndex == 0){
                    count = count > 1 ? count - 1 : count;
                }
                if(j == B.length()){
                    return count;
                }
            }
        }
        return -1;
    }
}