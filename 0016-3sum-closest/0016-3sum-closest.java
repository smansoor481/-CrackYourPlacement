class Solution {
    public int threeSumClosest(int[] arr, int target) {
        if(arr == null && target < 0) return 0; 
        Arrays.sort(arr);
        int resultSum = arr[0]+arr[1]+arr[2];
        int minDiff = Integer.MAX_VALUE;

        for(int i=0;i<arr.length-2;i++)
        {
            int left =i+1;
            int right = arr.length-1;

            while(left < right)
            {
                int sum = arr[i]+arr[left]+arr[right];

                if(sum == target)
                    return sum;
                if(sum < target)
                    left++;
                else
                    right--;

                int diffTarget = Math.abs(sum - target);
                if(diffTarget < minDiff)
                {
                    resultSum = sum;
                    minDiff = diffTarget;
                }
            }
        } 
        return resultSum;
    }
}