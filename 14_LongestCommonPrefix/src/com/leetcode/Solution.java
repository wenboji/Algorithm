package com.leetcode;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        char temp = ' ';
        int count = 0;
        int minLength = 0;
        boolean flag = true;
        if(strs.length==0){
            return "";
        }
        while (flag) {
            for (String str : strs) {
                if (str.length()==0||(temp != ' ' && temp != str.toCharArray()[count])) {
                    return result;
                }
                temp = str.toCharArray()[count];
                if(count==0){
                    if (minLength == 0) {
                        minLength = str.length();
                    } else if (minLength > str.length()) {
                        minLength = str.length();
                    }
                }
            }
            if (temp != ' ') {
                result += temp;
            }
            temp = ' ';
            count++;
            if (count == minLength) {
                flag = false;
            }
        }
        return result;
    }
}
