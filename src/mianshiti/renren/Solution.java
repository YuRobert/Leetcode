package mianshiti.renren;

/**
 * @author Robert17
 * @create2023-10-16-9:34
 */
public class Solution
{
    public String geshihua(String s)
    {
        String newStirng = "";
        if (s.contains("."))
        {
            int indexOfPoint = s.indexOf('.');
//            String[] split = s.split(".");
            String substring = s.substring(indexOfPoint);
            String a = s.substring(0, indexOfPoint);
            for (int i = a.length() - 1; i >= 0; i--)
            {
                if ( (a.length() - i - 1) % 3 == 0 && i != a.length() - 1)
                {
                    newStirng = a.charAt(i) + "," + newStirng;
                }
                else
                {
                    newStirng = a.charAt(i) + newStirng;
                }
            }
            newStirng = newStirng + substring;
        }
        else
        {
            for (int i = s.length() - 1; i >= 0; i--)
            {
                if ( (s.length() - i - 1) % 3 == 0 && i != s.length() - 1)
                {
                    newStirng = s.charAt(i) + "," + newStirng;
                }
                else
                {
                    newStirng = s.charAt(i) + newStirng;
                }
            }
        }
        return newStirng;

    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        String geshihua = solution.geshihua("0");
        System.out.println(geshihua);
    }
}
