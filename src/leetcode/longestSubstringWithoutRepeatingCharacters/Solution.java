package leetcode.longestSubstringWithoutRepeatingCharacters;

/**
 * @author Robert17
 * @create2022-10-05-12:24
 */
public class Solution
{
    public int lengthOfLongestSubstring(String s)
    {
        String max = "";
        for(int i = 0; i < s.length()-max.length(); i++)
        {
            String fmax = String.valueOf(s.charAt(i));
            for(int j = i+1; j < s.length(); j++)
            {
                if(fmax.contains(String.valueOf(s.charAt(j))))
                {
                    break;
                }
                else
                {
                    fmax = fmax +  s.charAt(j);
                }
            }
            if(fmax.length() > max.length())
            {
                max = fmax;
            }
        }
        return max.length();
    }
}
