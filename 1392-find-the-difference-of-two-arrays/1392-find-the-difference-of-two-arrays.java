class Solution {
    public List<List<Integer>> findDifference(int[] num1, int[] num2) {
        return Arrays.asList(getCommonValues(num1,num2), getCommonValues(num2,num1));
    }

    private List<Integer> getCommonValues(int[] num1, int[] num2)
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : num2)
        {
            set2.add(num);
        }

        for(int num : num1)
        {
            if(!set2.contains(num))
            {
                set1.add(num);
            }
        }

        return new ArrayList<>(set1);
    }
}