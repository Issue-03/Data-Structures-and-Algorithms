class Solution {

  public void insert(Node root, int key) {
    if (root == null) {
      root = new Node(key);
      return root;
    }
    if (key < root.key) root.left = insert(root.left, key); else if (
      key > root.key
    ) root.right = insert(root.right, key);

    return root;
  }
}
