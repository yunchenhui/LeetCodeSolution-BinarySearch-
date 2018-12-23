package BinarySearchTemplate3;
//Pow(x, n)
//实现 pow(x, n) ，即计算 x 的 n 次幂函数。
//
//示例 1:
//
//输入: 2.00000, 10
//输出: 1024.00000
//示例 2:
//
//输入: 2.10000, 3
//输出: 9.26100
//示例 3:
//
//输入: 2.00000, -2
//输出: 0.25000
//解释: 2-2 = 1/22 = 1/4 = 0.25
//说明:
//
//-100.0 < x < 100.0
//n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
//详细分析见：https://segmentfault.com/a/1190000008196055
public class CreatePow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class PowSolution{
	public double mypow(double x,int n) {
		if(n<0)
			return 1/pow(x,-n);
		else
			return pow(x,n);
	}
	public double pow(double x,int n) {
		if(n==0)
			return 1;
		double mid=pow(x,n/2);
		if(n%2==0)
			return mid*mid;
		else
			return mid*mid*x;
	}
}