class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int left = 1;
        int right = maxSum;
        int ans = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canPlace(mid, n, index, maxSum)) {
                ans = mid;
                left = mid + 1;  // try bigger value
            } else {
                right = mid - 1; // too big, reduce
            }
        }

        return ans;
    }

    // checks if nums[index] = peak is possible
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

    // computes sum of decreasing sequence on one side
    private long calcSide(int start, int count) {
        if (start >= count) {
            // full decreasing sequence: start + (start-1) + ... + (start-count+1)
            return (long)count * start - (long)count * (count - 1) / 2;
        } else {
            // it hits 1 before covering all positions
            long full = (long)start * (start + 1) / 2; // from start down to 1
            long ones = (count - start);               // remaining are 1s
            return full + ones;
        }
    }
}
