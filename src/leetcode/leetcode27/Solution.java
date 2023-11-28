package leetcode.leetcode27;

class Solution {
    public int removeElement(int[] nums, int val) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length){
            if (nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }else{
                fast++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int i = solution.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
//        System.out.println(i);
        Integer integer = Integer.valueOf("");
        System.out.println(integer);
    }

}