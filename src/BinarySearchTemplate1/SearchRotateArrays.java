package BinarySearchTemplate1;
//������ת��������
//���谴�����������������Ԥ��δ֪��ĳ�����Ͻ�������ת��
//
//( ���磬���� [0,1,2,4,5,6,7] ���ܱ�Ϊ [4,5,6,7,0,1,2] )��
//
//����һ��������Ŀ��ֵ����������д������Ŀ��ֵ���򷵻��������������򷵻� -1 ��
//
//����Լ��������в������ظ���Ԫ�ء�
//
//����㷨ʱ�临�Ӷȱ����� O(log n) ����
//
//ʾ�� 1:
//
//����: nums = [4,5,6,7,0,1,2], target = 0
//���: 4
//ʾ�� 2:
//
//����: nums = [4,5,6,7,0,1,2], target = 3
//���: -1
public class SearchRotateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class SearchRotateArraysSolution{
	public int search(int[] nums,int target) {
		if(nums.length==0)
			return -1;
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(nums[mid]==target)
				return mid;
			if(nums[mid]<=nums[right]) {
				if(target>nums[mid]&&target<=nums[right])
					left=mid+1;
				else
					right=mid-1;
			}
			else {
				if(target>=nums[left]&&target<nums[mid])
					right=mid-1;
				else
					left=mid+1;
			}
		}
		return -1;
	}
}