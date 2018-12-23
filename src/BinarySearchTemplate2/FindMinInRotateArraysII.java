package BinarySearchTemplate2;
//Ѱ����ת���������е���Сֵ II
//���谴�����������������Ԥ��δ֪��ĳ�����Ͻ�������ת��
//
//( ���磬���� [0,1,2,4,5,6,7] ���ܱ�Ϊ [4,5,6,7,0,1,2] )��
//
//���ҳ�������С��Ԫ�ء�
//
//ע�������п��ܴ����ظ���Ԫ�ء�
//
//ʾ�� 1��
//
//����: [1,3,5]
//���: 1
//ʾ�� 2��
//
//����: [2,2,2,0,1]
//���: 0
//˵����
//
//������� Ѱ����ת���������е���Сֵ ��������Ŀ��
//�����ظ���Ӱ���㷨��ʱ�临�Ӷ��𣿻����Ӱ�죬Ϊʲô��
//˼·:ֻ�е�mid �� right��ֵ��ͬ��ʱ����޷�ȷ�� ��Сֵ���ĸ����䣬�޷�ȷ����ʱ����right��ֵ �Լ��ͺã���Ϊright��һ���Ǵ��ڵ�����Сֵ��
public class FindMinInRotateArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class FindMinInRotateArraysIISolution{
	public int findMin(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right])
                left=mid+1;
            else if(nums[mid]<nums[right])
                right=mid;
            else
                right--;
        }
        return nums[left];
	}
}