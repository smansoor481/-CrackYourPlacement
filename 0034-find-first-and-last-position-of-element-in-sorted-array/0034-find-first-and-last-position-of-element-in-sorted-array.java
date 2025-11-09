class Solution {
    public int[] searchRange(int[] arr, int target) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                li.add(i);
            }
        }
        if(li.isEmpty())
        {
            return new int[]{-1,-1};
        }

        return new int[]{li.get(0), li.get(li.size()-1)};
    }
}