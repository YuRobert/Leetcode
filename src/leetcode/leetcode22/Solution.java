package leetcode.leetcode22;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<List<String>> dp = new ArrayList<>();
        dp.add(0, Arrays.asList(""));
        dp.add(1,Arrays.asList("()"));
        for (int i = 2; i < n + 1; i++)
        {
            List<String> stringList = new ArrayList<>();
            for (int j = 0; j < i; j++)
            {
                for (int k = 0; k < dp.get(j).size(); k++) {
                    for (int l = 0; l < dp.get(i - j - 1).size(); l++) {
                        stringList.add("(" + dp.get(j).get(k)+ ")"+dp.get(i - j - 1).get(l));
                    }
                }
            }
            dp.add(i,stringList);
        }
        return dp.get(n);
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        List<String> strings = solution.generateParenthesis(3);
        strings.forEach(System.out::println);
    }

}