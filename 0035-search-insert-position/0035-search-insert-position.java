class Solution {
    public int searchInsert(int[] arr, int target) {
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
            else if(arr[i] > target)
            {
                return i;
            }
        } 

        return arr.length; 
    }
}