package BinarySearchTemplate3;

import java.util.ArrayList;
import java.util.List;

//找到 K 个最接近的元素
//给定一个排序好的数组，两个整数 k 和 x，从数组中找到最靠近 x（两数之差最小）的 k 个数。返回的结果必须要是按升序排好的。如果有两个数与 x 的差值一样，优先选择数值较小的那个数。
//
//示例 1:
//
//输入: [1,2,3,4,5], k=4, x=3
//输出: [1,2,3,4]
// 
//
//示例 2:
//
//输入: [1,2,3,4,5], k=4, x=-1
//输出: [1,2,3,4]
// 
//
//说明:
//
//k 的值为正数，且总是小于给定排序数组的长度。
//数组不为空，且长度不超过 104
//数组里的每个元素与 x 的绝对值不超过 104
//解法：直接从数组里通过二分法找到应为的subarray的start位置，
//     通过判断mid位置和mid + k位置上与x的差值的大小比较来确定二分的update rule，因此时间复杂度好。
public class FindClosestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class FindClosestElementsSolution{
	public List<Integer> Solution(int[] arr,int k,int x){
		List<Integer> res = new ArrayList<Integer>();
		int start=0;
		int end=arr.length-k;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(Math.abs(arr[mid]-x)>Math.abs(arr[mid+k]-x)) {
				start=mid+1;
			}
			else
				end=mid;
		}
		for(int i=start;i<start+k;i++) {
			res.add(arr[i]);
		}
		return res;
	}
}