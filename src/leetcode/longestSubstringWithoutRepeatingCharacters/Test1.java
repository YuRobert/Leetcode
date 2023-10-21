package leetcode.longestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

/**
 * @author Robert17
 * @create2022-10-05-12:25
 */
public class Test1
{
    @Test
   public void test()
   {
       Solution s = new Solution();
       int i = s.lengthOfLongestSubstring("abcabcbb");
       System.out.println(i);
   }

}
