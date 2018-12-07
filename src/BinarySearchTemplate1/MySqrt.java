package BinarySearchTemplate1;
//x 的平方根
//实现 int sqrt(int x) 函数。
//
//计算并返回 x 的平方根，其中 x 是非负整数。
//
//由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
//
//示例 1:
//
//输入: 4
//输出: 2
//示例 2:
//
//输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842..., 
//     由于返回类型是整数，小数部分将被舍去。
public class MySqrt {

	public static void main(String[] args) {

	}

}
/*******************二分查找法********************/
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
/*****************牛顿迭代法解题(具体分析见文档 牛顿迭代法.doc)************/
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