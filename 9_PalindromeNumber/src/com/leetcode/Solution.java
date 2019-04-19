package com.leetcode;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int head;
        int tail;
        int length = (int) Math.log10(x);
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            head = x / (int) (Math.pow(10, length - i)) % 10;
            tail = x % (int) (Math.pow(10, i + 1)) / (int) ((Math.pow(10, i)));
            if (head != tail) {
                return false;
            }
        }
        return true;
    }
}
