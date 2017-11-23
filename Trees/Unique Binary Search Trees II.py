# Definition for a binary tree node
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def generateTrees(self, n):
        if n == 0:
            return []
        return self.genrecursive(1, n)

    def genrecursive(self, start, end):
        list1 = []
        if start > end:
            list1.append(None)
            return list1
        for x in range(start, end + 1):
            list2 = self.genrecursive(start, x - 1)
            list3 = self.genrecursive(x + 1, end)
            for y in list2:
                for z in list3:
                    a = TreeNode(x)
                    a.left = y
                    a.right = z
                    list1.append(a)
        return list1
