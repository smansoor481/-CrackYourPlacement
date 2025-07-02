class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0) return 0;

        for(int i=0;i<nums.length;i++)
        {
            boolean isUnique = false;

            for(int j=0;j<nums.length;j++)
            {
                if(i != j && nums[i] == nums[j])
                {
                    isUnique = true;
                    break;
                }
            }
            if(!isUnique)
            {
                return nums[i];
            }
        }
        return 0;
    }

}