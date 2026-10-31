package leetcode.editor.cn;

import java.util.*;

public class ID53MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new ID53MaximumSubarray().new Solution();

        //执行测试

        System.out.println("");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            //当前局部最大数组
            int currMax = nums[0];
            //全局最大数组
            int maxArr = currMax;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > currMax && currMax < 0) {
                    currMax = nums[i];
                } else {
                    currMax += nums[i];
                }
                maxArr = Math.max(currMax, maxArr);
            }
            return maxArr;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}