class Solution {
    public int compress(char[] chars) {
        int index = 0; // where to write in the array
        int i = 0;     // read pointer

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count how many times currentChar repeats
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[index++] = currentChar;

            // If count > 1, write its digits
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // final compressed length
    }
}