package BinarySearchTemplate3;
//��Ч����ȫƽ����
//����һ�������� num����дһ����������� num ��һ����ȫƽ�������򷵻� True�����򷵻� False��
//
//˵������Ҫʹ���κ����õĿ⺯������  sqrt��
//
//ʾ�� 1��
//
//���룺16
//�����True
//ʾ�� 2��
//
//���룺14
//�����False
public class IsPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class IsPerfectSquareSolution{
    public boolean isPerfectSquareSolution(int num) {
        long temp=num/2+1;
        long start=0;
        long end=temp;
        while(start<=end){
            long mid=start+(end-start)/2;
            long result=mid*mid;
            if(result==num)
                return true;
            else if(result<num)
                start=mid+1;
            else
                end=mid-1;
        }
        return false;
    }
}