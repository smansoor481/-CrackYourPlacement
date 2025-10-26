class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase(); // make all letters lowercase
        boolean[] seen = new boolean[26];  // to track a–z

        // Go through each character
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                seen[ch - 'a'] = true; // mark this letter as seen
            }
        }

        // Check if all 26 letters are present
        for (int i = 0; i < 26; i++) {
            if (!seen[i]) {
                return false; // if any letter is missing
            }
        }

        return true; // all letters found
    }
}
