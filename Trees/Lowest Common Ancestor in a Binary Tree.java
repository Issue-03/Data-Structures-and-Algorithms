// Given a Binary Tree with all unique values and two nodes value n1 and n2. 
// The task is to find the lowest common ancestor of the given two nodes. 
// We may assume that either both n1 and n2 are present in the tree or none of them is present. 

// Example:
// Input:
// 2
// 2 3
// 1 2 3
// 3 4
// 5 2 N 3 4
// Output:
// 1
// 2

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Tree {

  /* If n1 and n2 are present, return reference
   to LCA. If both are not present, return 
   null,. Else if left subtree contains any 
   of them return pointer to left.*/
  Node lca(Node node, int n1, int n2) {
    // Your code here
    if (node == null) return null;

    if (node.data == n1 || node.data == n2) return node;

    Node left_lca = lca(node.left, n1, n2);
    Node right_lca = lca(node.right, n1, n2);

    if (left_lca != null && right_lca != null) return node;

    return left_lca != null ? left_lca : right_lca;
  }
}
