package leetcode.editor.cn;

import java.util.*;

public class ID42TrappingRainWater {
    public static void main(String[] args) {
        Solution solution = new ID42TrappingRainWater().new Solution();

        //执行测试
//        solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        solution.trap(new int[]{4, 2, 0, 3, 2, 5});
        System.out.println();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int trap(int[] h) {
            if (h.length < 2) {
                return 0;
            }
            //双指针：lMax/rMax 表示本侧已扫描过的最大高度
            //lMax <= rMax 时说明右侧存在不低于 lMax 的墙，左边界即为水位，可安全结算第 l 列
            int l = 0, r = h.length - 1,
                    lMax = h[l],
                    rMax = h[r], sum = 0;
            while (l < r) {
                if (lMax <= rMax) {
                    int cur = h[++l];
                    if (cur > lMax) {
                        lMax = cur;          // 刷新左墙，本列蓄水为 0
                    } else {
                        sum += lMax - cur;
                    }
                } else {
                    int cur = h[--r];
                    if (cur > rMax) {
                        rMax = cur;          // 刷新右墙，本列蓄水为 0
                    } else {
                        sum += rMax - cur;
                    }
                }
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}