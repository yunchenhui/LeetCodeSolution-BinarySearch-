package BinarySearchTemplate2;
//Ѱ����ת���������е���Сֵ
//���谴�����������������Ԥ��δ֪��ĳ�����Ͻ�������ת��
//
//( ���磬���� [0,1,2,4,5,6,7] ���ܱ�Ϊ [4,5,6,7,0,1,2] )��
//
//���ҳ�������С��Ԫ�ء�
//
//����Լ��������в������ظ�Ԫ�ء�
//
//ʾ�� 1:
//
//����: [3,4,5,1,2]
//���: 1
//ʾ�� 2:
//
//����: [4,5,6,7,0,1,2]
//���: 0
public class FindMinInRotateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class FindMinInRotateArraysSolution{
	public int findMin(int[] nums) {
		if(nums.length==1)
			return nums[0];
		int left=0;
		int right=nums.length-1;
		while(left<right) {
			int mid=left+(right-left)/2;
			if(nums[mid]>nums[right])
				left=mid+1;
			else
				right=mid;
		}
		return nums[left];
	}
}