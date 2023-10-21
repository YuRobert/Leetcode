package leetcode.leetcode68;

/**
 * @author Robert17
 * @create2023-04-03-18:47
 */
public class Solution
{
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--)
        {
            if (digits[i] == 9)
            {
                digits[i] = 0;
            }
            else
            {
                digits[i]++;
                return digits;
            }
        }
        int[] newDig = new int[digits.length + 1];
        newDig[0] = 1;
        return newDig;
        
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] ints = solution.plusOne(new int[]{5,6,2,0,0,4,6,2,4,9});
        for (int i:ints)
        {
            System.out.println(i);
        }
    }
}
