import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);               // Sort the array
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) { // Check adjacent elements
                return nums[i];          // Return the duplicate
            }
        }
        throw new IllegalArgumentException("No duplicate found");
    }
}
