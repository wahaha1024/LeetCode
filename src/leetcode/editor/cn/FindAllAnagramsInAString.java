//给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "cbaebabacd", p = "abc"
//输出: [0,6]
//解释:
//起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
//起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
// 
//
// 示例 2: 
//
// 
//输入: s = "abab", p = "ab"
//输出: [0,1,2]
//解释:
//起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
//起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
//起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
// 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, p.length <= 3 * 10⁴ 
// s 和 p 仅包含小写字母 
// 
//
// Related Topics 哈希表 字符串 滑动窗口 👍 2047 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * 找到字符串中所有字母异位词
 * 2026-10-03 14:05:06  
 */
public class FindAllAnagramsInAString{
  public static void main(String[] args) {
       Solution solution = new FindAllAnagramsInAString().new Solution();
      List<Integer> anagrams = solution.findAnagrams("cbaebabacd", "abc");
      System.out.println("anagrams = " + anagrams);
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //返回值
        List<Integer> res = new ArrayList<>();
        int slength = s.length();
        int plength = p.length();
        if(slength<plength){
            return res;
        }
        //定义当前窗口每个字符个数和s的差值  p-s
        int[] count = new int[26];

        //初始化窗口
        for (int i = 0; i < p.length(); i++) {
            //s中字符新增进窗口
            ++count[s.charAt(i)-'a'];
            //p中字符新增进窗口
            --count[p.charAt(i)-'a'];
        }
        //定义窗口和p不一样个数的字符的个数,并首次扫描
        int diff = 0;
        for (int j = 0; j < 26; j++) {
            if(count[j]!=0){
                diff++;
            }
        }
        if(diff==0){
            res.add(0);
        }
        int l =0,r=0;
        //窗口滑动
        for (r = p.length(); r < s.length(); r++) {
            //---扩张
            //如果原来该字符差值为-1，则刚好匹配 diff -1  如果原来为0 则diff+1
            if(count[s.charAt(r)-'a']==-1){
                diff--;
            }
            if(count[s.charAt(r)-'a']==0){
                diff++;
            }
            //s中字符新增进窗口
            ++count[s.charAt(r)-'a'];

            //---收缩
            //如果原来该字符差值为1，则刚好匹配 diff -1  如果原来为0 则diff+1
            if(count[s.charAt(l)-'a']==1){
                diff--;
            }
            if(count[s.charAt(l)-'a']==0){
                diff++;
            }
            //l中字符数量-1
            --count[s.charAt(l)-'a'];
            l++;
            //判断是否是异位词
            if(diff==0){
                res.add(l);
            }
        }
        //收缩
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
