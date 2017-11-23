class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left_child = None
        self.right_child = None

    def insert_left(self, value):
        if self.left_child == None:
            self.left_child = BinaryTree(value)
        else:
            new_node = BinaryTree(value)
            new_node.left_child = self.left_child
            self.left_child = new_node

    def insert_right(self, value):
        if self.right_child == None:
            self.right_child = BinaryTree(value)
        else:
            new_node = BinaryTree(value)
            new_node.right_child = self.right_child
            self.right_child = new_node

    def inorder_trav(self):
        if self.left_child:
            self.left_child.inorder_trav

a_node=BinaryTree('a')
a_node.insert_left('b')
a_node.insert_right('c')

b_node=a_node.left_child
b_node.insert_left('d')
b_node.insert_right('e')

a_node.insert_left('f')

t=a_node.left_child
print(t.value)
print(t.left_child.value)
print(t.left_child.left_child.value)
print(t.left_child.right_child.value)