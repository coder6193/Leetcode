import sys
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isValidBST(self, root):
        return self.validateBST(root, -sys.maxint - 1, sys.maxint)

    def validateBST(self, node, minimum, maximum):
        if node is None:
            return True

        if node.val < minimum or node.val > maximum:
            return False

        return self.validateBST(node.left, minimum, (node.val) - 1) and self.validateBST(node.right, (node.val) + 1,
                                                                                         maximum)



