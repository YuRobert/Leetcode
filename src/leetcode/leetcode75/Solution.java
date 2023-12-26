package leetcode.leetcode75;

class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int two = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                zero = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 2){
                two = i;
                break;
            }
        }
        int i = zero;
        while (i <= two){
            if (nums[i] == 0){
                int temp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = temp;
                zero++;
                i++;
            }else if (nums[i] == 2){
                int temp = nums[two];
                nums[two] = nums[i];
                nums[i] = temp;
                two--;
            }else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1,2,0,1,1,0,2,2,0,1,1,1,2};
//        int[] ints = {2,0,2,1,1,0};
        solution.sortColors(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}