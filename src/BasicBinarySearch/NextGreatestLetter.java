package BasicBinarySearch;
//Ѱ�ұ�Ŀ����ĸ�����С��ĸ
//����һ��ֻ����Сд��ĸ����������letters ��һ��Ŀ����ĸ target��Ѱ���������������Ŀ����ĸ�����С��ĸ��
//
//��������ĸ��˳����ѭ���ġ��ٸ����ӣ����Ŀ����ĸtarget = 'z' ������������Ϊ letters = ['a', 'b']����𰸷��� 'a'��
//
//ʾ��:
//
//����:
//letters = ["c", "f", "j"]
//target = "a"
//���: "c"
//
//����:
//letters = ["c", "f", "j"]
//target = "c"
//���: "f"
//
//����:
//letters = ["c", "f", "j"]
//target = "d"
//���: "f"
//
//����:
//letters = ["c", "f", "j"]
//target = "g"
//���: "j"
//
//����:
//letters = ["c", "f", "j"]
//target = "j"
//���: "c"
//
//����:
//letters = ["c", "f", "j"]
//target = "k"
//���: "c"
//ע:
//
//letters���ȷ�Χ��[2, 10000]�����ڡ�
//letters ����Сд��ĸ��ɣ����ٰ���������ͬ����ĸ��
//Ŀ����ĸtarget ��һ��Сд��ĸ��
public class NextGreatestLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class NextGreatestLetterSolution{
	public char nextGreatestLetterSolution(char[] letters,char target) {
        int left=0;
        int right=letters.length-1;
        if(target>=letters[right])
            return letters[0];
        while(left<right){
            int mid=left+(right-left)/2;
            if(letters[mid]>target)
                right=mid;
            else
                left=mid+1;
        }
        return letters[left];
	}
}