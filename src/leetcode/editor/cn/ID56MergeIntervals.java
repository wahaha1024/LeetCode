package leetcode.editor.cn;

import java.util.*;
public class ID56MergeIntervals{
	public static void main(String[] args) {
		Solution solution = new ID56MergeIntervals().new Solution();

        //执行测试
		int[][] merged = solution.merge(new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}});

		System.out.println(Arrays.deepToString(solution.merge(merged)));
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n <= 1) {
            return intervals;
        }
        // 按左端点排序，值域 <= 10^4，相减不会溢出
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>(n);
        res.add(intervals[0]);
        int[] last = intervals[0];
        for (int i = 1; i < n; i++) {
            int[] cur = intervals[i];
            // 无交集：左端点严格大于上一区间右端点
            if (cur[0] > last[1]) {
                res.add(cur);
                last = cur;
            } else if (cur[1] > last[1]) {
                // 有交集：原地延展右端点，不再新建数组 / 增删元素
                last[1] = cur[1];
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}