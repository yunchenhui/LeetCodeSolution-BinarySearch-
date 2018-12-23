package BasicBinarySearch;

import java.util.*;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class IntersectionSolution{
	public int[] intersectionSolution(int[] nums1,int[] nums2) {
		Set<Integer> set=new HashSet<Integer>();
		for(int n:nums1)
			set.add(n);
		int i=0;
		for(int n:nums2)
			if(set.remove(n))
				nums2[i++]=n;
		return Arrays.copyOfRange(nums2, 0, i);
	}

}