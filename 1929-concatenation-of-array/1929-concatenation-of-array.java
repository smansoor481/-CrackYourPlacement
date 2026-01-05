class Solution {
    public int[] getConcatenation(int[] nums) {
        //length of the nums array
        int n = nums.length;
        
        //create a new ans array
        int[] ans = new int[2 * n];

        for(int i=0;i<n;i++)
        {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}