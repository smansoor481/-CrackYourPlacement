class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // handle if k > n

        int[] result = new int[n];

        // Place last k elements at the beginning
        for (int i = 0; i < k; i++) {
            result[i] = nums[n - k + i];
        }

        // Place the rest after
        for (int i = k; i < n; i++) {
            result[i] = nums[i - k];
        }

         // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }
}