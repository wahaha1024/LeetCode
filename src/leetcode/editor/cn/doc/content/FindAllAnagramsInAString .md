<p>给定两个字符串&#xa0;<code>s</code>&#xa0;和 <code>p</code>，找到&#xa0;<code>s</code><strong>&#xa0;</strong>中所有&#xa0;<code>p</code><strong>&#xa0;</strong>的&#xa0;<strong><span data-keyword="anagram">异位词</span>&#xa0;</strong>的子串，返回这些子串的起始索引。不考虑答案输出的顺序。</p>

<p>&#xa0;</p>

<p><strong>示例&#xa0;1:</strong></p>

<pre>
<strong>输入: </strong>s = "cbaebabacd", p = "abc"
<strong>输出: </strong>[0,6]
<strong>解释:</strong>
起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
</pre>

<p><strong>&#xa0;示例 2:</strong></p>

<pre>
<strong>输入: </strong>s = "abab", p = "ab"
<strong>输出: </strong>[0,1,2]
<strong>解释:</strong>
起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
</pre>

<p>&#xa0;</p>

<p><strong>提示:</strong></p>

<ul>
	<li><code>1 &lt;= s.length, p.length &lt;= 3 * 10<sup>4</sup></code></li>
	<li><code>s</code>&#xa0;和&#xa0;<code>p</code>&#xa0;仅包含小写字母</li>
</ul>

<div><div>Related Topics</div><div><li>哈希表</li><li>字符串</li><li>滑动窗口</li></div></div><br><div><li>👍 2047</li><li>👎 0</li></div>