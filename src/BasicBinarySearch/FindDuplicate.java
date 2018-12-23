package BasicBinarySearch;
//Ѱ���ظ���
//����һ������ n + 1 ������������ nums�������ֶ��� 1 �� n ֮�䣨���� 1 �� n������֪���ٴ���һ���ظ�������������ֻ��һ���ظ����������ҳ�����ظ�������
//
//ʾ�� 1:
//
//����: [1,3,4,2,2]
//���: 2
//ʾ�� 2:
//
//����: [3,1,3,4,2]
//���: 3
//˵����
//
//���ܸ���ԭ���飨����������ֻ���ģ���
//ֻ��ʹ�ö���� O(1) �Ŀռ䡣
//ʱ�临�Ӷ�С�� O(n2) ��
//������ֻ��һ���ظ������֣��������ܲ�ֹ�ظ�����һ�Ρ�
//˼·����������ⷨ��
//		�ⷨ1�����ö��ֲ���
//		�ⷨ2�����ÿ���ָ��
public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * ����Ϊ�ⷨһ�����ö��ֲ���
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
 *  ����Ϊ�ⷨ�������ÿ���ָ��
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