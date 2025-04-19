public class question3 {


    /* Question 3
    * Check Balanced: 
    * Implement a function to check if a binary tree is balanced. 
    * For the purposes of this question, a balanced tree is defined to be a tree 
    * such that the heights of the two subtrees of any node never differ by more than one.
    */

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
    }
    
    public boolean isBalanced(TreeNode root){

        if(root == null){
            return true;
        }

        int heightLeft = checkHeight(root.left);
        int heightRight = checkHeight(root.right);

        int dif = Math.abs(heightLeft - heightRight);

        return dif <= 1;
    }

    public int checkHeight(TreeNode root){

        if(root == null){
            return 0;
        }

        return Math.max(checkHeight(root.left) + 1, checkHeight(root.right) + 1);
    }


    //SOLUTION: O(n^2)
    public boolean isBalancedSOLUTION(TreeNode root) {
        if (root == null) {
            return true;
        }
    
        int heightLeft = checkHeight(root.left);
        int heightRight = checkHeight(root.right);
        int diff = Math.abs(heightLeft - heightRight);
    
        // Added recursive calls to check all subtrees
        return diff <= 1 && isBalancedSOLUTION(root.left) && isBalancedSOLUTION(root.right);
    }


    //SOLUTION: Optimized. O(n)
    public boolean isBalancedOptimized(TreeNode root) {
        return checkHeightAndBalance(root) != -1;
    }
    
    private int checkHeightAndBalance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        // Check left subtree
        int leftHeight = checkHeightAndBalance(root.left);
        if (leftHeight == -1) return -1; // Left subtree is unbalanced
        
        // Check right subtree
        int rightHeight = checkHeightAndBalance(root.right);
        if (rightHeight == -1) return -1; // Right subtree is unbalanced
        
        // Check balance at current node
        int heightDiff = Math.abs(leftHeight - rightHeight);
        if (heightDiff > 1) return -1; // Current node is unbalanced
        
        // Return height of current subtree
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
