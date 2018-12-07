package BinarySearchTemplate1;
//x ��ƽ����
//ʵ�� int sqrt(int x) ������
//
//���㲢���� x ��ƽ���������� x �ǷǸ�������
//
//���ڷ������������������ֻ���������Ĳ��֣�С�����ֽ�����ȥ��
//
//ʾ�� 1:
//
//����: 4
//���: 2
//ʾ�� 2:
//
//����: 8
//���: 2
//˵��: 8 ��ƽ������ 2.82842..., 
//     ���ڷ���������������С�����ֽ�����ȥ��
public class MySqrt {

	public static void main(String[] args) {

	}

}
/*******************���ֲ��ҷ�********************/
class MySqrtSolution {
    public int mySqrtSolution(int x) {
        long start=0;
        long end=x/2+1;
        int  result=0;
        long mid=0;
        long sqrt=0;
        while(start<=end){
            mid=start+(end-start)/2;
            sqrt=mid*mid;
            if(x>=sqrt){
                result=(int)mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return result;
    }
}
/*****************ţ�ٵ���������(����������ĵ� ţ�ٵ�����.doc)************/
//class MySqrtSolution {
//    public int mySqrtSolution(int x) {
//    	if(x==0)
//    		return 0;
//        long i=x;
//        while(i>x/i){
//            i=(i+x/i)/2;
//        }
//        return (int)i;
//    }
//}