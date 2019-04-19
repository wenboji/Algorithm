/**
 * @version 1.0 2019-04-15
 * @Author: Wenbo Ji
 * @Description:
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        char[] hayChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        int x = 0;
        for (int i = 0; i < hayChars.length; i++) {
            if (hayChars[i] == needleChars[x]) {
                for (int m = 1; m < needleChars.length; m++) {
                    if (hayChars[i + m] != needleChars[m - 1]) {
                        continue;
                    }
                    x++;
                }
            }

            if (x == needleChars.length - 1) {
                return i;
            }
        }
        return -1;
    }
}
