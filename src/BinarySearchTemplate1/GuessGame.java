package BinarySearchTemplate1;
//�����ִ�С
//����������һ����������Ϸ�� ��Ϸ�������£�
//�Ҵ� 1 �� n ѡ��һ�����֡� ����Ҫ����ѡ�����ĸ����֡�
//ÿ����´��ˣ��һ��������������Ǵ��˻���С�ˡ�
//�����һ��Ԥ�ȶ���õĽӿ� guess(int num)�����᷵�� 3 �����ܵĽ����-1��1 �� 0����
//
//-1 : �ҵ����ֱȽ�С
//1 : �ҵ����ֱȽϴ�
//0 : ��ϲ����¶��ˣ�
//ʾ�� :
//
//����: n = 10, pick = 6
//���: 6
/* The guess API is defined in the parent class GuessGame.
@param num, your guess
@return -1 if my number is lower, 1 if my number is higher, otherwise return 0
   int guess(int num); */
public class GuessGame {

	public static void main(String[] args) {

	}
	public int guess(int n) {
		return -1;
		
	}
}
class GuessGameSolution extends GuessGame{
	public int guessNumber(int n) {
		int left=1;
		int right=n;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(guess(mid)==0)
				return mid;
			else if(guess(mid)==-1) {
				left=mid++;
			}
			else {
				right=mid--;
			}
		}
		return -1;
	}
}