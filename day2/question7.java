package day2;
import java.util.HashMap;
import java.util.Hashtable;

public class question7 {

    /* Question 7
    * Check Permutation: 
    * Given two strings, write a method to decide if one is a permutation of the other.
    */


    public boolean checkPermutation(String firstString, String secondString){

        if(firstString.length() != secondString.length()){
            return false;
        }

        HashMap<Character, Boolean> map = new HashMap<>();

        for(int i=0; i<firstString.length(); i++){
            //add to hashmap

        }

        //check hashmap there is any string if no, return false.

        return false;
    }


    //Solution

      /**
     * Method 1: Using character counts with HashMap
     * Time Complexity: O(n) where n is the length of the strings
     * Space Complexity: O(k) where k is the number of unique characters
     */
    public boolean checkPermutationSolution(String firstString, String secondString) {
        // Check if lengths are different, if so, they can't be permutations
        if (firstString.length() != secondString.length()) {
            return false;
        }

        // Create a HashMap to count characters in the first string
        HashMap<Character, Integer> charCounts = new HashMap<>();

        // Count occurrences of each character in the first string
        for (int i = 0; i < firstString.length(); i++) {
            char c = firstString.charAt(i);
            int count = charCounts.getOrDefault(c, 0);
            charCounts.put(c, count + 1);
        }

        // Check if second string has the same character counts
        for (int i = 0; i < secondString.length(); i++) {
            char c = secondString.charAt(i);
            
            // If character doesn't exist in map or count is already 0, 
            // the strings are not permutations
            int count = charCounts.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            
            // Decrement the count
            charCounts.put(c, count - 1);
        }

        return true;
    }
    
}
