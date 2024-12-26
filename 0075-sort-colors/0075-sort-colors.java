class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        // Traverse the array
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[mid] and nums[low], then increment low and mid
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Move mid pointer forward
                mid++;
            } else if (nums[mid] == 2) {
                // Swap nums[mid] and nums[high], then decrement high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}