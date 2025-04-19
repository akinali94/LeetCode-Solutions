public class question4 {
    

    /* Question 4
    * Three in One: 
    * Describe how you could use a single array to implement three stacks.
    */


    /*
     * First, I divide array equally to 3.
     * Every stack has own part in array.
     * I write push and pop methods for every stack. 
     * one index keep the lastItem in stack, one index keep the limit of stack.
     * if stack is full, i return stack is full error.
    */


    public class ThreeStack{

        int n = 12;
        int[] stackArray = new int[n];

        public ThreeStack(int n){
            this.n = n;
        }

        int firstStackLimit = n/3 - 1;
        int secondStackLimit = firstStackLimit + n/3-1;
        int lastStackLimit = n-1;


        public void pushStack1(int e){

        }

        public void pushStack2(int e){

        }

        public void pushStack3(int e){

        }

        public int popStack1(){

        }
        public int popStack2(){

        }
        public int popStack3(){

        }



    }

    public class CorrectSolutionQ4 {

        /*
        * Solution: Fixed Division Approach
        * 1. Divide the array into three equal parts
        * 2. Track the top index for each stack separately
        * 3. Implement push and pop operations for each stack
        */
        public class ThreeStack {
            private int stackSize; // Size of each stack
            private int[] stackArray; // Single array to hold all three stacks
            private int[] stackPointers; // Top index for each stack
            
            // Constructor
            public ThreeStack(int stackSize) {
                this.stackSize = stackSize;
                stackArray = new int[3 * stackSize]; // Total array size for all three stacks
                stackPointers = new int[3]; // Pointers for each stack
                
                // Initialize stack pointers to their starting positions
                stackPointers[0] = -1; // Stack 1 starts at 0
                stackPointers[1] = -1; // Stack 2 starts at stackSize
                stackPointers[2] = -1; // Stack 3 starts at 2*stackSize
            }
            
            // Get the absolute index in the array for the top of a specific stack
            private int getAbsoluteIndex(int stackNum) {
                return stackNum * stackSize + stackPointers[stackNum];
            }
            
            // Check if a specific stack is empty
            public boolean isEmpty(int stackNum) {
                return stackPointers[stackNum] == -1;
            }
            
            // Check if a specific stack is full
            public boolean isFull(int stackNum) {
                return stackPointers[stackNum] == stackSize - 1;
            }
            
            // Push an element onto a specific stack
            public void push(int stackNum, int value) throws Exception {
                // Check if we have space
                if (isFull(stackNum)) {
                    throw new Exception("Stack " + stackNum + " is full");
                }
                
                // Increment the stack pointer and then update the value
                stackPointers[stackNum]++;
                stackArray[getAbsoluteIndex(stackNum)] = value;
            }
            
            // Pop an element from a specific stack
            public int pop(int stackNum) throws Exception {
                if (isEmpty(stackNum)) {
                    throw new Exception("Stack " + stackNum + " is empty");
                }
                
                // Get the value and then decrement the stack pointer
                int value = stackArray[getAbsoluteIndex(stackNum)];
                stackPointers[stackNum]--;
                return value;
            }
            
            // Peek at the top element of a specific stack
            public int peek(int stackNum) throws Exception {
                if (isEmpty(stackNum)) {
                    throw new Exception("Stack " + stackNum + " is empty");
                }
                
                return stackArray[getAbsoluteIndex(stackNum)];
            }
        }
        
        /*
        * Alternative: Flexible Division Approach
        * 1. Each stack can grow as needed
        * 2. More efficient use of space but more complex implementation
        */
        public class FlexibleThreeStack {
            private int[] stackArray;
            private int[] stackSizes; // Current size of each stack
            private int[] stackStart; // Starting index of each stack
            private int nextAvailable; // Next available position in the array
            
            public FlexibleThreeStack(int totalSize) {
                stackArray = new int[totalSize];
                stackSizes = new int[3];
                stackStart = new int[] {0, totalSize / 3, 2 * totalSize / 3};
                nextAvailable = 0;
            }
            
            // More complex implementation would be needed for push/pop operations
            // that dynamically resize each stack's allocation as needed
        }
        
        // Example usage
        public static void main(String[] args) {
            question4 q4 = new question4();
            ThreeStack stack = q4.new ThreeStack(4);
            
            try {
                // Testing stack 0
                stack.push(0, 10);
                stack.push(0, 20);
                System.out.println("Stack 0 top: " + stack.peek(0));
                
                // Testing stack 1
                stack.push(1, 30);
                stack.push(1, 40);
                System.out.println("Stack 1 top: " + stack.peek(1));
                
                // Testing stack 2
                stack.push(2, 50);
                stack.push(2, 60);
                System.out.println("Stack 2 top: " + stack.peek(2));
                
                // Pop from stacks
                System.out.println("Popped from stack 0: " + stack.pop(0));
                System.out.println("Popped from stack 1: " + stack.pop(1));
                System.out.println("Popped from stack 2: " + stack.pop(2));
                
                // Check new tops
                System.out.println("New stack 0 top: " + stack.peek(0));
                System.out.println("New stack 1 top: " + stack.peek(1));
                System.out.println("New stack 2 top: " + stack.peek(2));
                
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
