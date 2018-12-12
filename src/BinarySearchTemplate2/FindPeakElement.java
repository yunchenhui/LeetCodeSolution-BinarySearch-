package BinarySearchTemplate2;
//Ѱ�ҷ�ֵ
//��ֵԪ����ָ��ֵ������������ֵ��Ԫ�ء�
//
//����һ���������� nums������ nums[i] �� nums[i+1]���ҵ���ֵԪ�ز�������������
//
//������ܰ��������ֵ������������£������κ�һ����ֵ����λ�ü��ɡ�
//
//����Լ��� nums[-1] = nums[n] = -�ޡ�
//
//ʾ�� 1:
//
//����: nums = [1,2,3,1]
//���: 2
//����: 3 �Ƿ�ֵԪ�أ���ĺ���Ӧ�÷��������� 2��
//ʾ�� 2:
//
//����: nums = [1,2,1,3,5,6,4]
//���: 1 �� 5 
//����: ��ĺ������Է������� 1�����ֵԪ��Ϊ 2��
//     ���߷������� 5�� ���ֵԪ��Ϊ 6��
//˵��:
//
//��ĽⷨӦ���� O(logN) ʱ�临�Ӷȵġ�
public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class FindPeakElementSolution{
	public int findPeakElementSolution(int[] nums){
		if(nums==null||nums.length<=0)
			return -1;
		int left=0;
		int right=nums.length-1;
		while(left<right) {
			int mid=left+(right-left)/2;
			if(nums[mid]<nums[mid+1])
				left=mid+1;
			else
				right=mid;
		}
		return left;
	}
}