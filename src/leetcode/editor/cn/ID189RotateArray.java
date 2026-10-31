package leetcode.editor.cn;

import javafx.beans.binding.When;

import java.util.*;

public class ID189RotateArray {
    public static void main(String[] args) {
        Solution solution = new ID189RotateArray().new Solution();

        //执行测试

        System.out.println();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate(int[] nums, int k) {
            int l = nums.length;
            k %= l;
            reverse(nums, 0, l - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, l - 1);

        }

        public void reverse(int[] nums, int l, int r) {
            while (l<r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}