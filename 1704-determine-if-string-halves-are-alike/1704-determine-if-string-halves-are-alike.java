class Solution {
    public boolean halvesAreAlike(String s) {
        if(s.length() % 2 != 0)
        {
            return false;
        }

        int start = 0;
        int end = s.length()-1;

        int mid = start + (end - start)/2;
        int count1 = 0;
        int count2 = 0;
        String vowels = "aeiouAEIOU";

        for(int i=start; i<=mid;i++)
        {
            if(vowels.indexOf(s.charAt(i)) != -1)
            {
                count1++;
            }
        }

        for(int i=mid+1; i<=end;i++)
        {
            if(vowels.indexOf(s.charAt(i)) != -1)
            {
                count2++;
            }
        }


        if(count1 == count2)
        {
            return true;
        }
        return false;
    }
}