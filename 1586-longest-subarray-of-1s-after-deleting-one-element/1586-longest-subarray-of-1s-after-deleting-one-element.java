class Solution {
    public int longestSubarray(int[] nums) {
        int prev = 0;    
        int curr = 0;    
        int ans = 0;     
        boolean foundZero = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curr++;
            } else {
                ans = Math.max(ans, prev + curr);  
                prev = curr;
                curr = 0;
                foundZero = true;
            }
        }

        ans = Math.max(ans, prev + curr);

        if (!foundZero) {
            return ans - 1;
        } else {
            return ans;
        }
    }
}
