package BasicBinarySearch;
//寻找重复数
//给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
//
//示例 1:
//
//输入: [1,3,4,2,2]
//输出: 2
//示例 2:
//
//输入: [3,1,3,4,2]
//输出: 3
//说明：
//
//不能更改原数组（假设数组是只读的）。
//只能使用额外的 O(1) 的空间。
//时间复杂度小于 O(n2) 。
//数组中只有一个重复的数字，但它可能不止重复出现一次。
//思路：两种巧妙解法：
//		解法1：利用二分查找
//		解法2：利用快慢指针
public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * 以下为解法一：利用二分查找
 */
class FindDuplicateSolutionI{
	public int findDuplicate(int[] nums) {
		int left=0;
		int right=nums.length-1;
		while(left<right) {
			int mid=left+(right-left)/2;
			int cnt=0;
			for(int n:nums) {
				if(n<=mid)
					++cnt;
			}
			if(cnt>mid)
				right=mid;
			else
				left=mid+1;
		}
		return right;
	}
}
/*
 *  以下为解法二：利用快慢指针
 */
class FindDuplicateSolution{
	public int findDuplicate(int[] nums) {
		int	slow=0,fast=0,start=0;
		while(true) {
			slow=nums[slow];
			fast=nums[nums[fast]];
			if(slow==fast)
				break;
		}
		while(true) {
			slow=nums[slow];
			start=nums[start];
			if(start==slow)
				break;
		}
		return slow;
	}
}