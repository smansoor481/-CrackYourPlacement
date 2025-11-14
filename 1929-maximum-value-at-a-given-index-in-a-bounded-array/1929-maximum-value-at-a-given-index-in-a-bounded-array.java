class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int left = 1;
        int right = maxSum;
        int ans = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canPlace(mid, n, index, maxSum)) {
                ans = mid;
                left = mid + 1;   
            } else {
                right = mid - 1;  
            }
        }

        return ans;
    }

     
    private boolean canPlace(int peak, int n, int index, int maxSum) {
        long sum = peak;

        // left side length
        int leftLen = index;
        sum += calcSide(peak - 1, leftLen);

        // right side length
        int rightLen = n - index - 1;
        sum += calcSide(peak - 1, rightLen);

        return sum <= maxSum;
    }

     
    private long calcSide(int start, int count) {
        if (start >= count) {
             
            return (long)count * start - (long)count * (count - 1) / 2;
        } else {
            
            long full = (long)start * (start + 1) / 2;  
            long ones = (count - start);                
            return full + ones;
        }
    }
}
