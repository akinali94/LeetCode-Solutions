package day1;


/* Question 1
 * Product of Array Except Self
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 * 
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
*/

/* Question 2
 * Loop Detection: 
      Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
      DEFINITION
      Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.

      EXAMPLE
      Input: A -&gt; B -&gt; C -&gt; D -&gt; E -&gt; C [the same C as earlier] 
      Output: C
*/

/* Question 3
 * Construct Binary Tree from Preorder and Inorder Traversal

      Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder 
      is the inorder traversal of the same tree, construct and return the binary tree.

      Example 1:
      Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
      Output: [3,9,20,null,null,15,7]

      Example 2:
      Input: preorder = [-1], inorder = [-1]
      Output: [-1]

      Constraints:
      preorder and inorder consist of unique values.
      Each value of inorder also appears in preorder.
      preorder is guaranteed to be the preorder traversal of the tree.
      inorder is guaranteed to be the inorder traversal of the tree.
*/

/* Question 4
 * House Robber

      You are a professional robber planning to rob houses along a street. Each house has a certain amount of 
      money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have 
      security systems connected and it will automatically contact the police if two adjacent houses were broken 
      into on the same night.

      Given an integer array nums representing the amount of money of each house, return the maximum amount of 
      money you can rob tonight without alerting the police.

         

         Example 1:

         Input: nums = [1,2,3,1]
         Output: 4
         Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
         Total amount you can rob = 1 + 3 = 4.
         Example 2:

         Input: nums = [2,7,9,3,1]
         Output: 12
         Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
         Total amount you can rob = 2 + 9 + 1 = 12.
*/

/* Question 5
 * Search in Rotated Array: 
      Given a sorted array of n integers that has been rotated an unknown number of times, write code to find an element in the array. You may assume that the array was originally sorted in increasing order.

      EXAMPLE
      Input: find 5 in {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14}
      Output: 8 (the index of 5 in the array)
*/

/* Question 6
 * Sort Stack: 
       Write a program to sort a stack such that the smallest items are on the top. 
       You can use an additional temporary stack, but you may not copy the elements into any other data structure 
       (such as an array). The stack supports the following operations: push, pop, peek, and isEmpty.
*/

/* Question 7
 * Clone Graph

    Given a reference of a node in a connected undirected graph.

    Return a deep copy (clone) of the graph.

    Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
*/

/* Question 8
 * Insertion: 

      You are given two 32-bit numbers, N and M, and two bit positions, i and j. 
      Write a method to insert M into N such that M starts at bit j and ends at bit i. 
      You can assume that the bits j through i have enough space to fit all of M. That is, 
      if M = 10011, you can assume that there are at least 5 bits between j and i. You would not, 
      for example, have j = 3 and i = 2, because M could not fully fit between bit 3 and bit 2.

      EXAMPLE
      Input: N = 10000000000, M = 10011, i = 2, j = 6 
      Output: N = 10001001100
*/


