class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            long bSquared = c - a * a;
            if (binarySearch(0, (int) Math.sqrt(bSquared), bSquared))
                return true;
        }
        return false;
    }

    private boolean binarySearch(long start, long end, long target) {
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;

            if (square == target)
                return true;
            else if (square < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
}
