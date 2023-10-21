package leetcode.leetcode7;

/**
 * @author Robert17
 * @create2022-11-17-18:40
 */
public class Solution
{
    public int reverse(int x) {
        int num;
        int flag = 1;
        String str  = Integer.toString(x);

        if(x < 0)
        {
            flag = -1;
            str = str.substring(1);
        }
        char[] strc = str.toCharArray();
        for (int i = 0; i < strc.length/2; i++) {
            char t = strc[i];
            strc[i] = strc[ strc.length-1 - i];
            strc[ strc.length-1 - i] = t;
        }
        try
        {
            num = Integer.parseInt(String.valueOf(strc))*flag;
        }
        catch (Exception e)
        {
            return 0;
        }



        return num;
    }
}
