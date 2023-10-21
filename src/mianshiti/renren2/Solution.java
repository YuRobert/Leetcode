package mianshiti.renren2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robert17
 * @create2023-10-16-14:10
 */
public class Solution
{
    public List<Integer> find(int[] nums1, int[] nums2)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < nums1.length && p2 <nums2.length)
        {
            if (nums1[p1] == nums2[p2] )
            {
                boolean flag = true;
                while(p1 > 0 &&nums1[p1] == nums1[p1 -1] )
                {
                    p1++;
                    flag = false;
                }
                while(p2 > 0 && nums2[p2] == nums2[p2 -1])
                {
                    p2++;
                    flag = false;
                }
                if (flag)
                {
                    list.add(nums1[p1]);
                }
                p1++;
                p2++;
            }
            else if(nums1[p1] > nums1[p2])
            {
                p2++;
            }
            else
            {
                p1++;
            }
        }
        return list;
    }

    // 1 3 5 7 9
    // 1 4 6 7 9
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,1,3,5,7,9,10};
        int[] nums2 = new int[]{1,1,4,6,7,9};
        List<Integer> list = solution.find(nums1, nums2);
        list.forEach(System.out::println);

    }
}
