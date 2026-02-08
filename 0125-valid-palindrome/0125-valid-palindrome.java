class Solution {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start =0;
        int end = str.length()-1;

        while(start<end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}