class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        
        for (String word : words) {
            // last character = position number
            int position = word.charAt(word.length() - 1) - '0';
            
            // actual word = everything except last character
            String actualWord = word.substring(0, word.length() - 1);
            
            // place it at correct index
            result[position - 1] = actualWord;
        }
        
        // join with space
        return String.join(" ", result);
    }
}
