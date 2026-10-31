# 长期记忆（MEMORY.md）

## 项目与工具
- LeetCode 刷题仓库：`E:\项目\resources\LeetCode`，Java，包名固定 `leetcode.editor.cn`。
- 使用 IntelliJ 的 **LeetCode Editor** 插件（shuzijun）：登录 `leetcode.cn`，拉题生成 `src/leetcode/editor/cn/IDxxTitle.java`（外层类含本地 `main` 测试 + 内层 `class Solution` 被 `//leetcode submit region` 标记包裹，仅该段提交），每题题面在 `src/leetcode/editor/cn/doc/content/<同名>.md`。
- 远端：`https://github.com/wahaha1024/LeetCode`，分支 `master`；推送需走系统代理 `127.0.0.1:7890`（已配 git http.proxy）。GitHub 凭据落地于 gh hosts.yml 与 `~/.git-credentials`。

## 用户协作偏好（稳定）
- 交流语言：中文。
- 期望两种协作：①解答算法题时协助优化代码（效率/风格/潜在错误）；②遇到疑问时答疑算法思想与解题思路。
- 代码约束：只改 submit region 内的 `Solution`；保留外层类与 `main` 测试桩；调试 `println` 写在 `main` 里可接受，`Solution` 内必须删；优化时勿自动 commit/push。

## 已建立的资产
- 用户级 skill：`leetcode-coach`，路径 `~/.codebuddy/skills/leetcode-coach/`（SKILL.md + references/）。用于长期承载上述协作流程。
