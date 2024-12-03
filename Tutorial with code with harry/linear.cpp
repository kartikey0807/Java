#include <iostream>

using namespace std;

// Definition for a binary tree node
class TreeNode {
public:
    int val;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

void preOrder(TreeNode* root) {
    if (root == nullptr) {
        return;
    }

    // Print the value of the current node
    cout << root->val << " ";

    // Traverse the left subtree
    preOrder(root->left);

    // Traverse the right subtree
    preOrder(root->right);
}

int main() {
    // Create the nodes
    TreeNode* root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->left = new TreeNode(4);
    root->left->right = new TreeNode(5);

    // Perform preorder traversal and print the result
    cout << "Preorder traversal: ";
    preOrder(root);
    cout << endl;
    return 0;
}