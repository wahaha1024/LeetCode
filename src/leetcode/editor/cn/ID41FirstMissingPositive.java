package leetcode.editor.cn;

import java.util.*;

public class ID41FirstMissingPositive {
    public static void main(String[] args) {
        Solution solution = new ID41FirstMissingPositive().new Solution();

        //执行测试

        System.out.println();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int n = nums.length;
            //如果nums中全部数在1-nums.length中，最小正整数为nums.length+1
            for (int i = 0; i < n; i++) {
                if (nums[i] <= 0) {
                    nums[i] = n + 1;
                }
            }
            for (int i = 0; i < n; i++) {
				int num = Math.abs(nums[i]);
				if (num <= n) {
					nums[num - 1] = -Math.abs(nums[num - 1]);
				}
            }
            for (int i = 0; i < n; i++) {
                if (nums[i] > 0) {
                    return i + 1;
                }
            }
            return n + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}