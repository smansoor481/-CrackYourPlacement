class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       
        Set<Integer> li = new TreeSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i] == nums2[j])
                {
                    li.add(nums1[i]);
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