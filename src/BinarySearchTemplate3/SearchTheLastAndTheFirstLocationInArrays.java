package BinarySearchTemplate3;
//在排序数组中查找元素的第一个和最后一个位置
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
//
//你的算法时间复杂度必须是 O(log n) 级别。
//
//如果数组中不存在目标值，返回 [-1, -1]。
//
//示例 1:
//
//输入: nums = [5,7,7,8,8,10], target = 8
//输出: [3,4]
//示例 2:
//
//输入: nums = [5,7,7,8,8,10], target = 6
//输出: [-1,-1]
public class SearchTheLastAndTheFirstLocationInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/****************用一次二分查找找到目标数，然后向左右遍历找到初始位置和末尾位置****************************/
class SearchRangeSolutionI{
	public int[] searchRange(int[] nums,int target) {
		int[] result= {-1,-1};
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(nums[mid]==target) {
				while(mid>=left&&nums[mid]==target){
					mid--;
				}
				result[0]=mid+1;
				mid=left+(right-left)/2;
				while(mid<=right&&nums[mid]==target){
					mid++;
				}
				result[1]=mid-1;
				break;
			}
			else if(nums[mid]<target) {
				left=mid+1;
			}
			else
				right=mid-1;
		}
		return result;
	}
}
/************通过向左二分查找找初始位置，向右二分查找找末尾位置*************/
class SearchRangeSolutionII{
	public int[] searchRange(int[] nums,int target){
		int[] result=new int[] {-1,-1};
        if(nums.length==0)
            return result;
        if (nums.length == 1) {
             if (nums[0] != target) {
                 return result;
             } else {
                 return new int[]{0, 0};
             }
        }
		result[0]=findFirstLocation(nums, target);
		result[1]=findLastLocation(nums, target);
		return result;
	}
    private int  findFirstLocation(int[] nums,int target){
        int index=-1;
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
            if(nums[mid]==target)
                index=mid;
			if(nums[mid]>=target) {
				right=mid-1;
			}
			else
				left=mid+1;
		}
        return index;
	}
	private int findLastLocation(int[] nums,int target) {
        int index=-1;
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
                index=mid; 
			if(nums[mid]<=target) {
				left=mid+1;
			}
			else
				right=mid-1;
		}
        return index;
	}
}