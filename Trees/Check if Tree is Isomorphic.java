// Given two Binary Trees. Check whether they are Isomorphic or not.
// Note:
// Two trees are called isomorphic if one of them can be obtained from other by a series of flips, i.e. by swapping left
// and right children of a number of nodes. Any number of nodes at any level can have their children swapped. Two empty
// trees are isomorphic.

// Example:
// Input:
// 2
// 1 2 3 4
// 1 3 2 4
// 1 2 3 4
// 1 3 2 N N N 4
// Output:
// No
// Yes

class BinaryTree {

  boolean isIsomorphic(Node root1, Node root2) {
    if (root1 == null && root2 == null) return true;

    if (root1 == null || root2 == null) return false;

    if (root1.data != root2.data) return false;

    return (
      isIsomorphic(root1.left, root2.left) &&
      isIsomorphic(root1.right, root2.right) ||
      isIsomorphic(root1.left, root2.right) &&
      isIsomorphic(root1.right, root2.left)
    );
  }
}
