class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums == null || k <= 0 || nums.length < k)
            return 0.0;

        int sum = 0;
        double res;
        for(int i=0;i<k;i++)
        {
            sum += nums[i];
        }

        res = (double)sum / k;

        for (int right = k; right < nums.length; right++) 
        {
            sum += nums[right];
            sum -= nums[right - k];
            res = Math.max(res, (double) sum / k);
        }

        return res;
    }
}