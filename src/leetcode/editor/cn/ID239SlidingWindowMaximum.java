package leetcode.editor.cn;

import java.util.*;
import java.util.concurrent.ForkJoinPool;

public class ID239SlidingWindowMaximum {
    public static void main(String[] args) {
        Solution solution = new ID239SlidingWindowMaximum().new Solution();

        //执行测试

        System.out.println(solution.maxSlidingWindow(new int[]{1,-1}, 1));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            //双端队列  存下标
            Deque<Integer> dq = new ArrayDeque<Integer>();
            //结果长度
            int t = nums.length - k + 1;
            int[] res = new int[t];
            //初始化
            for (int i = 0; i < k; i++) {
                while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                    dq.pollLast();
                }
                dq.offerLast(i);
            }
            res[0] = nums[dq.peekFirst()];
            //遍历，更大的后浪淘汰末尾前浪
            for (int i = k; i < nums.length; i++) {
                while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                    dq.pollLast();
                }
                dq.offerLast(i);
                if (dq.peekFirst() <= i-k) {
                    dq.pollFirst();
                }
                res[i - k + 1] = nums[dq.peekFirst()];
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}