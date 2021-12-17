/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isValidBST(TreeNode* root) {
        TreeNode* prev = NULL;
        int flag = 1;
        checker(root, prev, flag);
        return flag;
    }
    void checker(TreeNode* root, TreeNode* &prev, int &flag){
        if(!root) return;
        checker(root->left,prev,flag);
        if(prev!=NULL && root->val <= prev->val){
            flag = 0;
            return;
        }
        prev = root;
        checker(root->right,prev,flag);
    }
};
