package leetcode.leetcode20;

import java.util.Stack;

/**
 * @author Robert17
 * @create2022-10-26-19:43
 */
public class Solution
{
    public boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                if(stack.peek() == '(')
                {
                    if(s.charAt(i) != ')')
                    {
                        return false;
                    }
                    else
                    {
                        stack.pop();
                    }

                }
                else if(stack.peek() == '[')
                {
                    if(s.charAt(i) != ']')
                    {
                        return false;
                    }
                    else
                    {
                        stack.pop();
                    }
                }
                else if(stack.peek() == '{')
                {
                    if(s.charAt(i) != ']')
                    {
                        return false;
                    }
                    else
                    {
                        stack.pop();
                    }
                }

            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }
}
