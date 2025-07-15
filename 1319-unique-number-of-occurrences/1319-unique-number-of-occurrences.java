import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each number
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Use a set to track unique frequencies
        Set<Integer> frequencySet = new HashSet<>();
        
        for (int freq : countMap.values()) {
            if (!frequencySet.add(freq)) {
                // Duplicate frequency found
                return false;
            }
        }
        
        return true; // All frequencies are unique
    }
}
