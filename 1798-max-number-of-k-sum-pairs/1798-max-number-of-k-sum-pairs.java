class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt=0;
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            if(nums[left]+nums[right]==k)
            {
                cnt++;
                left++;
                right--;
            }
            else if(nums[left]+nums[right]<k) left++;
            else right--;
        }
        return cnt;
    }
}