# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def inorderTraversal(self, root):
        list = []
        self.helper(root, list)
        return list

    def helper(self, root, list):
        if root:
            self.helper(root.left, list)
            list.append(root.val)
            self.helper(root.right, list)