public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        def __init__(self): 
        self.head = None

    def traverse(self): 
        if self.head != None: 
            current_node = self.head 
            print current_node.value
            while current_node.next != None: 
                current_node = current_node.next
                print current_node.value
        else: 
            print "No nodes"
            return False

    def add_node(self, val): 
        new_node = Node(val)

        if self.head == None: 
            self.head = new_node
        else: 
            current_node = self.head
            while current_node.next != None: 
                current_node = current_node.next
            current_node.next = new_node 

    def print_as_list(self): 
        value_list = []
        if self.head != None: 
            current_node = self.head 
            while current_node.next != None: 
                value_list.append(current_node.value)
                current_node = current_node.next 
            value_list.append(current_node.value)
            print value_list
            print self.head
        else: 
            print "No nodes"
            return False

    def remove_node(self): 
        if self.head != None: 
            current_node = self.head 
        
       def insert_node_after(self, val, new): 
        
        new_node = Node(new)
       
        if self.head != None: 
            current_node = self.head
           
            while current_node.value != val:
                current_node = current_node.next
                if current_node.next == None: 
                    print "Value not in list"
                    return False
            
            new_node.next = current_node.next
            current_node.next = new_node

        else: 
            
            self.head = new_node/
    }
    
    

    //not sure I fully understand this. will practice more 