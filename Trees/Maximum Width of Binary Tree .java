// Given a binary tree, write a function to get the maximum width of the given tree.
// The width of a tree is the maximum width among all levels.
// The binary tree has the same structure as a full binary tree, but some nodes are null.

// The width of one level is defined as the length between the end-nodes
// (the leftmost and right most non-null nodes in the level, where the null nodes between
// the end-nodes are also counted into the length calculation.

// Example 1:

// Input:

//            1
//          /   \
//         3     2
//        / \     \
//       5   3     9

// Output: 4
// Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9).
// Example 2:

// Input:

//           1
//          /
//         3
//        / \
//       5   3

// Output: 2
// Explanation: The maximum width existing in the third level with the length 2 (5,3).

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

  public int widthOfBinaryTree(TreeNode root) {
    if (root == null) return 0;
    root.val = 1;
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    int maxWidth = 1;
    while (!q.isEmpty()) {
      int size = q.size();
      int left = q.peek().val;
      int right = left;
      for (int i = 0; i < size; i++) {
        root = q.poll();
        if (root.val > right) right = root.val;
        if (root.left != null) {
          root.left.val = root.val * 2 - 1;
          q.offer(root.left);
        }
        if (root.right != null) {
          root.right.val = root.val * 2;
          q.offer(root.right);
        }
      }
      if ((right - left + 1) > maxWidth) maxWidth = right - left + 1;
    }
    return maxWidth;
  }
}
