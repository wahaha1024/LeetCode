package leetcode.editor.cn;

import java.util.*;

public class ID76MinimumWindowSubstring {
    public static void main(String[] args) {
        Solution solution = new ID76MinimumWindowSubstring().new Solution();

        //执行测试

        System.out.println();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String minWindow(String s, String t) {
            if (s.length() < t.length()) return "";
            int len = s.length(), l = 0, r = 0, need = 0, have = 0;
            char[] sCharArray = s.toCharArray();
            //目标子串数组记录每个字符个数
            int[] tar = new int[128];
            //当前窗口字符个数
            int[] curr = new int[128];
            String res = "";
            //初始化目标数组
            t.chars().forEach(c -> tar[c]++);
            for (int c : tar) {
                if(c>0){
                    need++;
                }
            }
            //滑动窗口初始化
            while (r < t.length()) {
                char c = sCharArray[r++];
                curr[c]++;
                if (tar[c] > 0 && curr[c] == tar[c]) {
                    have++;
                }
            }
            //滑动
            while (true) {
                //如果当前满足
                if (need == have) {
                    String str = s.substring(l, r);
                    if (res.isEmpty() || str.length() < res.length()) {
                        res = str;
                    }
                    //左指针右移
                    if (tar[sCharArray[l]] > 0 && curr[sCharArray[l]] == tar[sCharArray[l]]) {
                        have--;
                    }
                    curr[sCharArray[l]]--;
                    l++;
                } else {
                    if (r == len) break;
                    curr[sCharArray[r]]++;
                    if (tar[sCharArray[r]] > 0 && curr[sCharArray[r]] == tar[sCharArray[r]]) {
                        have++;
                    }
                    r++;
                }
            }
            return res;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}