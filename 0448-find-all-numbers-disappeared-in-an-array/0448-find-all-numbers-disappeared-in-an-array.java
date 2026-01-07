class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n = nums.length;

        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=1;i<=n;i++)
        {
            ts.add(i);
        }

        for(int i=0;i<n;i++)
        {
            ts.contains(nums[i]);
            ts.remove(nums[i]);
        }

        return ts.stream().toList();

    }
}