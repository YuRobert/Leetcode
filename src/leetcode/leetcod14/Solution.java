package leetcode.leetcod14;

/**
 * @author Robert17
 * @create2022-10-18-20:44
 */
public class Solution
{
    public String longestCommonPrefix(String[] strs)
    {
        String prefix = "";
        char a;
        char b;
        int flag = 0;
        boolean end = false;
        for (int i = 0; i < strs.length; i++)
        {
            if(strs[i].isEmpty())
            {
                return prefix;
            }
        }
        for(int j = 0; j < 5; j++)
        {
            for(int i = 0; i < strs.length; i++ )
            {
                if(j == strs[i].length())
                {
                    end = true;
                    break;
                }

                if(i == 0 )
                {
                    a = strs[i].charAt(j);
                    b = strs[i].charAt(j);
                }
                else
                {
                    a = strs[i-1].charAt(j);
                    b = strs[i].charAt(j);
                }
                if (a != b)
                {
                    flag = 1;
                    break;
                }

            }
            if(flag != 1 && !end)
            {
                prefix= prefix + strs[0].charAt(j);
            }
            if(end)
            {
                break;
            }
        }
        return prefix;
    }

}
