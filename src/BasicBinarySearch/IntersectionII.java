package BasicBinarySearch;

import java.util.*;

public class IntersectionII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class IntersectionSolutionII{
	public int[] intersect(int[] nums1,int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		List<Integer> list=new ArrayList<Integer>();
		int i=0;
		int j=0;
		while(i<nums1.length&&j<nums2.length) {
			if(nums1[i]==nums2[j]) {
				list.add(nums1[i]);
				i++;
				j++;
			}
			else if(nums1[i]>nums2[j]) {
				j++;
			}
			else { 
				i++;
			}
		}
		int[] result=new int[list.size()];
		for(int k=0;k<list.size();k++) {
			result[k]=list.get(k);
		}
		return result;
	}
}