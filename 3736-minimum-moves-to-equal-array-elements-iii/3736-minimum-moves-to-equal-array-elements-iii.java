
class Solution {
    public int minMoves(int[] nums) {

        int max = nums[0];
        int count = 0;

        // Find maximum element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Calculate total moves
        for (int i = 0; i < nums.length; i++) {
            count = count + (max - nums[i]);
        }

        return count;
    }
}
