import java.util.ArrayList;
import java.util.List;

public class question6 {


    /* Question 6
    * Permutations without Dups: 
    * Write a method to compute all permutations of a string of unique characters.
    */

    //Solution - I don't have a solution
        /**
     * Approach 1: Recursive solution building permutations from subproblems
     * Time Complexity: O(n!) where n is the length of the string
     * Space Complexity: O(n!) to store all the permutations
     */
    public List<String> getPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        
        // Base case
        if (str == null) {
            return null;
        }
        
        if (str.length() == 0) {
            // Empty string has one permutation - itself
            permutations.add("");
            return permutations;
        }
        
        // Take the first character
        char firstChar = str.charAt(0);
        // Get the remainder of the string
        String remainder = str.substring(1);
        
        // Recursively get all permutations of the remainder
        List<String> words = getPermutations(remainder);
        
        // Insert the first character into all positions of each permutation
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                // Insert the first character at position i
                String s = insertCharAt(word, firstChar, i);
                permutations.add(s);
            }
        }
        
        return permutations;
    }
    
    /**
     * Helper method to insert a character at a specific position in a string
     */
    private String insertCharAt(String word, char c, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;
    }
    
    /**
     * Approach 2: Building permutations by choosing one character at a time
     * This approach builds permutations directly
     */
    public List<String> getPermutations2(String str) {
        List<String> result = new ArrayList<>();
        getPermutationsHelper("", str, result);
        return result;
    }
    
    private void getPermutationsHelper(String prefix, String remaining, List<String> result) {
        int n = remaining.length();
        
        // Base case: no more characters to add
        if (n == 0) {
            result.add(prefix);
        } else {
            // Try adding each character to our prefix
            for (int i = 0; i < n; i++) {
                getPermutationsHelper(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1, n),
                    result
                );
            }
        }
    }
    
    public static void main(String[] args) {
        question6 q6 = new question6();
        
        // Test with some examples
        String[] tests = {"", "a", "ab", "abc", "abcd"};
        
        for (String test : tests) {
            System.out.println("Permutations of '" + test + "':");
            List<String> perms = q6.getPermutations(test);
            System.out.println(perms);
            System.out.println("Count: " + perms.size());
            System.out.println();
        }
    }

}
