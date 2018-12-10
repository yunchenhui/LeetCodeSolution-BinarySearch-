package BinarySearchTemplate1;
//猜数字大小
//我们正在玩一个猜数字游戏。 游戏规则如下：
//我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
//每次你猜错了，我会告诉你这个数字是大了还是小了。
//你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
//
//-1 : 我的数字比较小
//1 : 我的数字比较大
//0 : 恭喜！你猜对了！
//示例 :
//
//输入: n = 10, pick = 6
//输出: 6
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