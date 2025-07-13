class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int curent = 0;
        for(int i=0;i<gain.length;i++)
        {
            curent=  curent + gain[i];
            max = Math.max(curent, max);
        }
        return max;
    }
}