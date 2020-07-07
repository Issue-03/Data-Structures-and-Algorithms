// Write a function that returns true if the given Binary Tree of size N is SumTree else return false.
// A SumTree is a Binary Tree in which value of each node x is equal to sum of nodes present in its
// left subtree and right subtree. An empty tree is SumTree and sum of an empty tree can be considered as 0.
// A leaf node is also considered as SumTree.
// Example:
// Input:
// 2
// 3 1 2
// 10 20 30 10 10

// Output:
// 1
// 0

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
}
*/

//O(n)
class Tree {

  boolean isSumTree(Node node) {
    int ls; // for sum of nodes in left subtree
    int rs; // for sum of nodes in right subtree

    /* If node is NULL or it's a leaf node then 
         return true */
    if (node == null || isLeaf(node) == 1) return true;

    if (isSumTree(node.left) != false && isSumTree(node.right) != false) {
      // Get the sum of nodes in left subtree
      if (node.left == null) ls = 0; else if (isLeaf(node.left) != 0) ls =
        node.left.data; else ls = 2 * (node.left.data);

      // Get the sum of nodes in right subtree
      if (node.right == null) rs = 0; else if (isLeaf(node.right) != 0) rs =
        node.right.data; else rs = 2 * (node.right.data);

      /* If root's data is equal to sum of nodes in left 
               and right subtrees then return 1 else return 0*/
      if ((node.data == rs + ls)) return true; else return false;
    }

    return false;
  }

  int isLeaf(Node node) {
    if (node == null) return 0;
    if (node.left == null && node.right == null) return 1;
    return 0;
  }
}

// O(n2)
class Tree {

  boolean isSumTree(Node node) {
    if (
      (node == null) || (node.left == null && node.right == null)
    ) return true;

    int leftSum = sum(node.left);
    int rightSum = sum(node.right);

    if (node.data == leftSum + rightSum) if (isSumTree(node.left) != false) if (
      isSumTree(node.right) != false
    ) return true;

    return false;
  }

  int sum(Node node) {
    if (node == null) return 0;

    return sum(node.left) + node.data + sum(node.right);
  }
}
