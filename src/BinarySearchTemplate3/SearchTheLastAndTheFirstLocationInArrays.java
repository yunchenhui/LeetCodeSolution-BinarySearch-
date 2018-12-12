package BinarySearchTemplate3;
//�����������в���Ԫ�صĵ�һ�������һ��λ��
//����һ�������������е��������� nums����һ��Ŀ��ֵ target���ҳ�����Ŀ��ֵ�������еĿ�ʼλ�úͽ���λ�á�
//
//����㷨ʱ�临�Ӷȱ����� O(log n) ����
//
//��������в�����Ŀ��ֵ������ [-1, -1]��
//
//ʾ�� 1:
//
//����: nums = [5,7,7,8,8,10], target = 8
//���: [3,4]
//ʾ�� 2:
//
//����: nums = [5,7,7,8,8,10], target = 6
//���: [-1,-1]
public class SearchTheLastAndTheFirstLocationInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/****************��һ�ζ��ֲ����ҵ�Ŀ������Ȼ�������ұ����ҵ���ʼλ�ú�ĩβλ��****************************/
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
/************ͨ��������ֲ����ҳ�ʼλ�ã����Ҷ��ֲ�����ĩβλ��*************/
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