class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);

        long low = 1, high = target;
        long ans = target; 
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sum = mid * (mid + 1) / 2;

            if (sum >= target) {
                ans = mid;
                high = mid - 1;  
            } else {
                low = mid + 1;  
            }
        }

        long sum = ans * (ans + 1) / 2;
        while ((sum - target) % 2 != 0) {
            ans++;
            sum += ans;
        }

        return (int) ans;
    }
}
