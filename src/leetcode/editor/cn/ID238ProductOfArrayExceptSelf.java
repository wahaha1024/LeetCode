package leetcode.editor.cn;

import java.util.*;
public class ID238ProductOfArrayExceptSelf{
	public static void main(String[] args) {
		Solution solution = new ID238ProductOfArrayExceptSelf().new Solution();

        //执行测试
		
		System.out.println();
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        //新建集合保存每个元素右边元素的积
		int n = nums.length;
		int[] r = new int[n];
		r[n-1]=1;
		//当前左边元素的积
		int l = 1;
		int[] answer = new int[n];
		for (int i = n-2; i >= 0; i--) {
			r[i] = r[i+1]*nums[i+1];
		}
		//遍历
		for (int i = 0; i < n	; i++) {
			answer[i]= l * r[i];
			l*= nums[i];
		}
		return answer;
//		int n = nums.length;
//		int[] answer = new int[n];
//		int l=1,r=1;
//		Arrays.fill(answer,1);
//		for (int i = 0,j=n-1; i < n; i++,j--) {
//			answer[i]*=l;
//			l*=nums[i];
//			answer[j]*=r;
//			r*=nums[j];
//		}
//		return answer;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}