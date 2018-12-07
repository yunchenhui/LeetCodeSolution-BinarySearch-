package BasicBinarySearch;
//���ֲ���
//����һ�� n ��Ԫ������ģ������������� nums ��һ��Ŀ��ֵ target  ��дһ���������� nums �е� target�����Ŀ��ֵ���ڷ����±꣬���򷵻� -1��
//
//
//ʾ�� 1:
//
//����: nums = [-1,0,3,5,9,12], target = 9
//���: 4
//����: 9 ������ nums �в����±�Ϊ 4
//ʾ�� 2:
//
//����: nums = [-1,0,3,5,9,12], target = 2
//���: -1
//����: 2 ������ nums ����˷��� -1
//
//
//��ʾ��
//
//����Լ��� nums �е�����Ԫ���ǲ��ظ��ġ�
//n ���� [1, 10000]֮�䡣
//nums ��ÿ��Ԫ�ض����� [-9999, 9999]֮�䡣
public class Search {

	public static void main(String[] args) {

	}

}
class SearchSolution{
	public int searchSolution(int[] nums,int target) {
		int right=nums.length-1;
		int left=0;
		int middle=0;
		while(left<=right) {
			if(nums[left]==target)
				return left;
			if(nums[right]==target)
				return right;
			middle=(left+right)/2;
			if(nums[middle]==target)
				return middle;
			else if(nums[middle]>target) {
				left++;
				right=middle;
			}
			else if(nums[middle]<target) {
				right--;
				left=middle;
			}
		}
		return -1;
	}
}