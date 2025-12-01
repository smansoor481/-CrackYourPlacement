class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reverString = new StringBuilder();

        for(String word : words)
        {
            StringBuilder reverWord = new StringBuilder(word);
            reverString.append(reverWord.reverse().toString()).append(" ");
        }

        return reverString.toString().trim();
    }
}