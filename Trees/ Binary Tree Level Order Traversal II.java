// Given a binary tree, return the bottom-up level order traversal of its nodes
// ' values. (ie, from left to right, level by level from leaf to root).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its bottom-up level order traversal as:
// [
//   [15,7],
//   [9,20],
//   [3]
// ]

class Solution {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
    if (root == null) return result;
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    while (!q.isEmpty()) {
      int size = q.size();
      List<Integer> levels = new ArrayList<Integer>();
      for (int i = 0; i < size; i++) {
        TreeNode node = q.poll();
        levels.add(node.val);
        if (node.left != null) q.add(node.left);
        if (node.right != null) q.add(node.right);
      }
      result.addFirst(levels);
    }
    return result;
  }
}
