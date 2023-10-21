package leetcode.romanToInteger;

import java.util.HashMap;

/**
 * @author Robert17
 * @create2022-10-05-15:07
 */
public class Solution
{
    public int romanToInt(String s) {
        HashMap<Character,Integer> hashMap= new HashMap();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if(i < s.length() - 1)
            {
                int j = i + 1;
                if (hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(j)))
                {
                    sum = sum + hashMap.get(s.charAt(j)) - hashMap.get(s.charAt(i));
                    i = i + 1;
                }
                else
                {
                    sum = sum + hashMap.get(s.charAt(i));
                }
            }
            else
            {
                sum = sum + hashMap.get(s.charAt(i));
            }

        }
        return sum;
    }
}
