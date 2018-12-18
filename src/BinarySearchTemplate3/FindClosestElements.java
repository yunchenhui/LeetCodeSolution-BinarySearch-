package BinarySearchTemplate3;

import java.util.ArrayList;
import java.util.List;

//�ҵ� K ����ӽ���Ԫ��
//����һ������õ����飬�������� k �� x�����������ҵ���� x������֮����С���� k ���������صĽ������Ҫ�ǰ������źõġ�������������� x �Ĳ�ֵһ��������ѡ����ֵ��С���Ǹ�����
//
//ʾ�� 1:
//
//����: [1,2,3,4,5], k=4, x=3
//���: [1,2,3,4]
// 
//
//ʾ�� 2:
//
//����: [1,2,3,4,5], k=4, x=-1
//���: [1,2,3,4]
// 
//
//˵��:
//
//k ��ֵΪ������������С�ڸ�����������ĳ��ȡ�
//���鲻Ϊ�գ��ҳ��Ȳ����� 104
//�������ÿ��Ԫ���� x �ľ���ֵ������ 104
//�ⷨ��ֱ�Ӵ�������ͨ�����ַ��ҵ�ӦΪ��subarray��startλ�ã�
//     ͨ���ж�midλ�ú�mid + kλ������x�Ĳ�ֵ�Ĵ�С�Ƚ���ȷ�����ֵ�update rule�����ʱ�临�ӶȺá�
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