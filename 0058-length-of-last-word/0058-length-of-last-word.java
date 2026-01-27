class Solution {
    public int lengthOfLastWord(String s) {
        String trimString = s.trim();

        String[] words = trimString.split("\\s+");

        String lastWords = words[words.length-1];
        int length = lastWords.length();

        return length;

    }
}