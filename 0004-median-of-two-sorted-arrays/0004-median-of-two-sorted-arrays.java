class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> li = new ArrayList<>();

        // Add all elements from nums1
        for (int num : nums1) {
            li.add(num);
        }

        // Add all elements from nums2
        for (int num : nums2) {
            li.add(num);
        }

        // Sort the combined list
        li.sort(null);
        System.out.println(li);

        int size = li.size();
        if (size % 2 == 1) {
            return li.get(size / 2);
        } 
        else {
            return (li.get(size / 2 - 1) + li.get(size / 2)) / 2.0;
        }
    }
}
