package day2;
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
}
