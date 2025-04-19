public class question5 {


    /* Question 5
    * Partition: 
    * Write code to partition a linked list around a value x, such 
    * that all nodes less than x come before all nodes greater than or equal to x. 
    * If x is contained within the list, the values of x only need to be after the 
    * elements less than x (see below). The partition element x can appear anywhere 
    * in the "right partition"; it does not need to appear between the left and right partitions.
    * 
    * EXAMPLE
    * Input: 3 -&gt; 5 -&gt; 8 -&gt; 5 -&gt; 10 -&gt; 2 -&gt; 1 [partition=5] 
    * Output: 3 -&gt; 1 -&gt; 2 -&gt; 10 -&gt; 5 -&gt; 5 -&gt; 8
    */


    public class Node {
        int data;
        Node next;
    }

    public Node partition(Node linkedList, int partitionNumber){

        //First check data is smaller than partitionNumber if small go to next.


        Node iter = linkedList;

        while(iter.data < partitionNumber && iter.next != null && iter.next.data < partitionNumber){
            iter = iter.next;
        }

        //check next data is smaller or greater.

        Node iter2 = iter;
        while(iter2.next.data >= partitionNumber && iter2.next != null){
            iter2 = iter2.next;
        }

        Node iter3 = iter2;
        while(iter3.next != null){
            iter3 = iter3.next;
        }

        iter3.next = iter.next;
        iter.next = iter2.next;
        iter2.next = null;

        //How can i do this with repetition.
    }


    //Solution
        /**
     * Approach 1: Create two separate lists and merge them
     * Time Complexity: O(n) - we traverse the list once
     * Space Complexity: O(1) - we reuse the existing nodes
     */
    public Node partitionSolution(Node head, int x) {
        // Handle edge cases
        if (head == null) {
            return null;
        }
        
        // Create dummy heads for our two lists
        Node beforeStart = new Node(0);  // Dummy node for nodes < x
        Node beforeEnd = beforeStart;
        
        Node afterStart = new Node(0);   // Dummy node for nodes >= x
        Node afterEnd = afterStart;
        
        // Iterate through the original list
        Node current = head;
        while (current != null) {
            // Save next pointer before modifying
            Node next = current.next;
            
            if (current.data < x) {
                // Add to "before" list
                beforeEnd.next = current;
                beforeEnd = current;
            } else {
                // Add to "after" list
                afterEnd.next = current;
                afterEnd = current;
            }
            
            // Break the original link
            current.next = null;
            
            // Move to next node
            current = next;
        }
        
        // Connect the two lists
        beforeEnd.next = afterStart.next;
        
        // Return the merged list (skipping the dummy head)
        return beforeStart.next;
    }
    
    /**
     * Approach 2: In-place rearrangement using a single pass
     * This is more space efficient but a bit more complex
     */
    public Node partitionInPlaceSolution(Node head, int x) {
        // Handle edge cases
        if (head == null) {
            return null;
        }
        
        Node dummy = new Node(0);
        dummy.next = head;
        
        // Keep track of the last node of the "before" partition
        Node beforeEnd = dummy;
        
        // Current and previous pointers for traversal
        Node prev = dummy;
        Node current = head;
        
        while (current != null) {
            if (current.data < x) {
                // If current is already in the right position, just move pointers
                if (prev == beforeEnd) {
                    beforeEnd = current;
                    prev = current;
                    current = current.next;
                } else {
                    // Remove current from its position
                    Node next = current.next;
                    prev.next = next;
                    
                    // Insert current after beforeEnd
                    current.next = beforeEnd.next;
                    beforeEnd.next = current;
                    beforeEnd = current;
                    
                    // Move current
                    current = next;
                }
            } else {
                // Current value is >= x, keep it where it is
                prev = current;
                current = current.next;
            }
        }
        
        return dummy.next;
    }



    
}
