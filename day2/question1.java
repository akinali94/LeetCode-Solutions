public class question1 {

    //"aabcccccaaa" --> "a2b1c5a3"

    //Edge: original >= compressed
    //Only lowercase

    public String compress(String original){


        StringBuilder compressed = new StringBuilder();

        for(int i=0; i < original.length();){
            
            char first = original.charAt(i);
            compressed.append(first);

            int iter = i;
            while(original.charAt(iter) != first && iter <= original.length()){
                iter++;
            }

            int number = iter - i + 1;
            compressed.append(number);
            
            i = iter + 1;
        }

        if(compressed.length() >= original.length()){
            return original;
        }

        return compressed.toString();
    }


    public static void main(String[] args) {
        question1 q1 = new question1();

        System.out.println(q1.compress("aabcccccaaa"));
    }


    //SOLUTION: Time Complexity O(n) Space Complexity O(n)
    public String compressSolution(String original) {
        // Handle empty string
        if (original == null || original.isEmpty()) {
            return original;
        }

        StringBuilder compressed = new StringBuilder();
        
        int count = 1;
        char current = original.charAt(0);
        
        for (int i = 1; i < original.length(); i++) {
            if (original.charAt(i) == current) {
                // Same character, increment count
                count++;
            } else {
                // Different character found, append the current character and its count
                compressed.append(current);
                compressed.append(count);
                
                // Reset for the new character
                current = original.charAt(i);
                count = 1;
            }
        }
        
        // Don't forget to append the last character and its count
        compressed.append(current);
        compressed.append(count);
        
        // Return original if compression doesn't save space
        return compressed.length() < original.length() ? compressed.toString() : original;
    }

}
