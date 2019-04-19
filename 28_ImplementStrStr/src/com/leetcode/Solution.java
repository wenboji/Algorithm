package com.leetcode;

/**
 * @version 1.0 2019-04-15
 * @Author: Wenbo Ji
 * @Description:
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        char[] hayChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        if (needleChars.length == 0) {
            return 0;
        } else if (hayChars.length >= needleChars.length) {
            for (int i = 0; i < hayChars.length; i++) {
                for (int i1 = 0; i1 < needleChars.length && i + i1 < hayChars.length; i1++) {
                    if (hayChars[i + i1] != needleChars[i1]) {
                        break;
                    } else if (i1 + 1 == needleChars.length) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public int strsStr(String haystack, String needle) {
//        char[] hayChars = haystack.toCharArray();
//        char[] needleChars = needle.toCharArray();
        if (needle.length() == 0) {
            return 0;
        } else if (haystack.length() >= needle.length() && haystack.contains(needle)) {
            for (int i = 0; i <= (haystack.length() - needle.length()); i++) {
                System.out.println(haystack.substring(i, needle.length() + i));
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strsStr(
                "mississippi",
                "pi"));
    }
}
