class Solution {
    public String reverseVowels(String str) {
        char[] ch = str.toCharArray();
        String vowels = "AEIOUaeiou";
        int start = 0;
        int end = ch.length-1;


        while(start < end)
        {

        

        while(start < end && vowels.indexOf(ch[start]) == -1)
            start++;

        while(start < end && vowels.indexOf(ch[end]) == -1)
            end--;

        char c = ch[start];
        ch[start] = ch[end];
        ch[end] = c;
        start++;
        end--;
        }

    return new String(ch);
    }
}