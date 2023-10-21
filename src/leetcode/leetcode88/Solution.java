package leetcode.leetcode88;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < n + m; i++)
        {
            nums1[i] = nums2[i-m];
        }
        for (int i = 0; i < nums1.length-1; i++)
        {
            for (int j = i; j < nums1.length; j++)
            {
                if (nums1[i] > nums1[j])
                {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};

        solution.merge(nums1,3,nums2, 3);
        for (int i = 0; i < nums1.length; i++)
        {
            System.out.println(nums1[i]);
        }
    }
}