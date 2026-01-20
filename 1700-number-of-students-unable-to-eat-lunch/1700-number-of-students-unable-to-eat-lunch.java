class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        int count0 = 0, count1 = 0;

        // Count student preferences
        for (int s : students) {
            if (s == 0) count0++;
            else count1++;
        }

        // Process sandwiches from top to bottom
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (count0 == 0) {
                    return count1; // no student wants circular sandwich
                }
                count0--;
            } else {
                if (count1 == 0) {
                    return count0; // no student wants square sandwich
                }
                count1--;
            }
        }

        return 0; // all students ate
    }
}
