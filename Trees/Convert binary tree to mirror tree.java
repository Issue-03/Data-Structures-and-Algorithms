void mirrorTree(Node root) {
    if(root == null)
    return;

    Node temp = null;
    mirrorTree(root.left);
    mirrorTree(root.right);

    temp = root.left;
    root.left = root.right;
    root.right = temp;
}