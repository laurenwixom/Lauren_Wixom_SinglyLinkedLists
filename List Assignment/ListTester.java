public class ListTester {
    public static void main(String[] args) {
        sll = SinglyLinkedList()
sll.add_node(10)
sll.add_node(23)
sll.add_node(15)
sll.add_node(50)
sll.traverse()
sll.print_as_list()
sll.remove_node()
print "Add nodes"
sll.print_as_list()
sll.insert_node_after(23, 30)
print "Insert node"
sll.print_as_list()
print "Remove node after head"
sll.remove_node_after(10)
sll.print_as_list()
print "Remove node"
sll.print_as_list()
sll.find_value(15)