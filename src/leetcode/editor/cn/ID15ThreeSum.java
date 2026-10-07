package leetcode.editor.cn;

import java.util.*;

public class ID15ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ID15ThreeSum().new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);//-4 -1 -1 0 1 2
            //返回值
            ArrayList<List<Integer>> res = new ArrayList<>();
            if (nums.length < 3) {
                return res;
            }
            int n = nums.length, l = 0, r = 0;
            for (int i = 0; i < n - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int targ = nums[i];
                //targ确定的时候，对撞指针判断是否存在和为-targ
                l = i + 1;
                r = n - 1;
                while (l < r) {
                    if (l > i + 1 && nums[l] == nums[l - 1]) {
                        l++;
                        continue;
                    }
                    if (r < n-1 && nums[r] == nums[r + 1]) {
                        r--;
                        continue;
                    }
                    if (nums[l] + nums[r] == -targ) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(targ);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        res.add(list);
                        l++;
                        r--;
                    } else if (nums[l] + nums[r] > -targ) {
                        r--;
                    } else if (nums[l] + nums[r] < -targ) {
                        l++;
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}