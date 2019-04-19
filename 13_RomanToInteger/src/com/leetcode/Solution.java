package com.leetcode;

public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int current = 0;
        int prev = 0;

        char[] roman = s.toLowerCase().toCharArray();
        for(char x: roman){

            switch(x){
                case 'i':current = 1;
                    break;
                case 'v': current = 5;
                    break;
                case 'x': current = 10;
                    break;
                case 'l': current = 50;
                    break;
                case 'c': current = 100;
                    break;
                case 'd': current = 500;
                    break;
                case 'm': current = 1000;
                    break;
            }

            if(prev<current){
                sum += current - prev * 2;
            }else{
                sum += current;
            }
            prev = current;
        }

        return sum;
    }
}
