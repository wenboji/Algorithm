import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @version 1.0 2019-04-15
 * @Author: Wenbo Ji
 * @Description:
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {return 0;}
        int i = 0;
        for(int m = 1; m< nums.length;m++){
            if(nums[m] != nums[i]){
                i++;
                nums[i] = nums[m];
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }


        return i + 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.removeDuplicates(new int[]{1, 1, 2});
    }
}
