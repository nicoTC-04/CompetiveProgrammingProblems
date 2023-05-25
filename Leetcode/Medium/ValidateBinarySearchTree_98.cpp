#include <vector>
#include <string>
#include <iostream>
#include <unordered_set>
#include <algorithm>

using namespace std;


//Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution {
public:
    bool isValidBST(TreeNode* root) {
        return rec(root, LLONG_MIN, LLONG_MAX);
    }

    bool rec(TreeNode* node, long long l, long long r){
        if(node == NULL){return true;}
        if(!(node->val > l && node->val < r)){return false;}
        return (rec(node->left, l, node->val) && rec(node->right, node->val, r));
    }
};