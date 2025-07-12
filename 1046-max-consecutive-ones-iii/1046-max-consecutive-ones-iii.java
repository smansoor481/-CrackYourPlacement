class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int start = 0;
        int max_ones = 0;

        for(int i =0; i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                count++;
            }
            while(count > k)
            {
                if(nums[start] == 0)
                {
                    count--;
                }
                start++;
            }

            max_ones = Math.max(max_ones, i - start + 1);
        } 
        return max_ones;
    }
}