package day2;
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
}
