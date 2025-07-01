class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int m = num1.length;
        int n = num2.length;
        int k = 0;

        int[] merged = new int[m+n];

        for(int i=0;i<m;i++)
        {
            merged[k++] = num1[i];
        }

        for(int i=0;i<n;i++)
        {
            merged[k++] = num2[i];
        }

        Arrays.sort(merged);

        int total = merged.length;

        if(total % 2 == 1)
        {
            return (double) merged[total/2];
        }
        else
        {
            int mid1 = merged[total/2-1];
            int mid2 = merged[total/2];
            return ((double)mid1 + (double)mid2) / 2.0;
        }


         
    }
}