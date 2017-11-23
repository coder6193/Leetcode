class Solution(object):
    def numTrees(self, n):
        dic = {}
        dic[0] = 1
        dic[1] = 1
        return self.treenum(1, n, {})

    def treenum(self, start, end, dic):
        count = 0;
        if start > end:
            return 1
        for x in range(start, end + 1):
            if x - start in dic:
                count1 = dic[x - start]
            else:
                count1 = self.treenum(start, x - 1, dic)
                dic[x - start] = count1
            if end - x in dic:
                count2 = dic[end - x]
            else:
                count2 = self.treenum(x + 1, end, dic)
                dic[end - x] = count2
            count = count + count1 * count2
        return count