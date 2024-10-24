/**
 * 100_Same Tree.cpp
 * https://leetcode.com/problems/same-tree/?envType=study-plan-v2&envId=top-interview-150
 *
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
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if(!p && !q) return 1;
        if(!p || !q) return 0;

        if(p->val != q->val) return 0;

        return isSameTree(p->left,q->left) && isSameTree(p->right, q->right);
    }
};