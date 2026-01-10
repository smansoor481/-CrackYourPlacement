class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        int tIndex = 0;
        List<String> li = new ArrayList<>();

        for (int i = 1; i <= n; i++)
        {
            li.add("Push");

            if (tIndex < target.length && i == target[tIndex]) 
            {
                tIndex++;
            } 
            else
            {
                li.add("Pop");
            }

            if (tIndex == target.length) 
            {
                break;
            }
        }

        return li;
    }
}