package leetcode.palindromeNumber;

/**
 * @author Robert17
 * @create2022-10-05-14:40
 */
public class Solution
{
    //第一种方法
    //转为字符串进行判断
    public boolean isPalindrome1(int x) {
        String strx = String.valueOf(x);
        System.out.println(strx);
        String strx1 = new StringBuffer(strx).reverse().toString();
        System.out.println(strx1);
        if(strx.equals(strx1))
        {
            return true;
        }
        return false;
    }
    //第二种方法
    //利用除法和取余运算计算出每个位数得值，再拼接在一起判断是否想等
    public boolean isPalindrome2(int x) {
        int a = x;
        int y = 0;
        int b = 0;
        while (a != 0)
        {
            b = a % 10;
            y = y*10 + b;
            a = a/10;
        }
        return x == y;
    }
}
