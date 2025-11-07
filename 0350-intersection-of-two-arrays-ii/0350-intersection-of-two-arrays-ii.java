class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    li.add(nums1[i]);
                     nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        int[] result = new int[li.size()];
        int index = 0;
        for(int num : li)
        {
            result[index++] = num;
        }

        return result;
    }
}