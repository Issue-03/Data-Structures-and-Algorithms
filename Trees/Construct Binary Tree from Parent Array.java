class GFG {
  static Node root;

  static void createNode(int parent[], int ele, Node created[]) {
    if (created[ele] != null) return;

    created[ele] = new Node(ele);

    if (parent[ele] == -1) {
      root = created[ele];
      return;
    }

    if (created[parent[ele]] == null) createNode(parent, parent[ele], created);

    Node p = created[parent[ele]];

    if (p.left == null) p.left = created[ele]; else p.right = created[ele];
  }

  public static Node createTree(int parent[], int n) {
    Node[] created = new Node[n];
    for (int i = 0; i < n; i++) created[i] = null;

    for (int i = 0; i < n; i++) createNode(parent, i, created);

    return root;
  }
}
