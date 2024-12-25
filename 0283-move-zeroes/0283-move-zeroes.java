class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<=nums.length-1;j++)
        {
            if(nums[j] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}