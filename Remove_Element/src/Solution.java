/**
 * @version 1.0 2019-04-15
 * @Author: Wenbo Ji
 * @Description:
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        for (int m = 0; m < nums.length; m++) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}

