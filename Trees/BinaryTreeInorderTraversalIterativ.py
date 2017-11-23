class Solution(object):
    def inorderTraversal(self, root):
        list1=[]
        list2=[]
        curr=root;
        while 1:
            if curr:
                list2.append(curr)
                curr=curr.left
            else:
                if len(list2)>0:
                    ele=list2[len(list2)-1]
                    list2.pop()
                    list1.append(ele.val)
                    curr=ele.right
                else:
                    return list1