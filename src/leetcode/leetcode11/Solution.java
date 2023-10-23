package leetcode11;

class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        while (right > left)
        {
            maxWater = Math.min(height[left],height[right])*(right-left) > maxWater?Math.min(height[left],height[right])*(right-left):maxWater;
            if (height[left] > height[right])
            {
                right--;
            }
            else
            {
                left++;
            }

        }
        return maxWater;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(i);
    }
}