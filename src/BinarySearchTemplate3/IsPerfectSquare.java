package BinarySearchTemplate3;
//有效的完全平方数
//给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
//
//说明：不要使用任何内置的库函数，如  sqrt。
//
//示例 1：
//
//输入：16
//输出：True
//示例 2：
//
//输入：14
//输出：False
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