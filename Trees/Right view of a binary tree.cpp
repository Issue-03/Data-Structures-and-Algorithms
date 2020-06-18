/* A binary tree node has data, pointer to left child
   and a pointer to right child 
struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
    
    Node(int x){
        data = x;
        left = right = NULL;
    }
}; */

void rightViewUtil(struct Node *root, int level, int *max_level)
{
    if (root == NULL)
        return;
    if (*max_level < level)
    {
        cout << root->data << " ";
        *max_level = level;
    }
    rightViewUtil(root->right, level + 1, max_level);
    rightViewUtil(root->left, level + 1, max_level);
}
void rightView(Node *root)
{
    // Your Code here
    int max_level = 0;
    rightViewUtil(root, 1, &max_level);
}