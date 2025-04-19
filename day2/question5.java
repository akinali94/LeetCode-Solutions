package day2;
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





    
}
