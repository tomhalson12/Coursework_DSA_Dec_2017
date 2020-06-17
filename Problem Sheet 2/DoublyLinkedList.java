class DoublyLinkedList {
    private ListNode2 head = null;
    private ListNode2 node = null;
    private int n = 0; // list size

	// TODO implement this...

    public void addFirst(Object o){
        node = new ListNode2(o, node, node);
        if(n == 0){
            head = node;
        }else{
            head.prev = node;
            head = node;
            head.prev = null;
        }
      
        n++;
    }

    public Object get(int i){
        if(!(i<0 || i>=n)){
            ListNode2 node = head;
            for(int j=0; j<i; j++){
                node = node.next;
            }
            return node.element;
        }else{
            return null;
        }
    }

    public void insert(Object o, int i){

        if(!(i<0 || i>n)){
            if(i == 0){
                addFirst(o);

            }else{
                ListNode2 node = head;
                ListNode2 newNode = null;

                for(int j = 0; j<i-1; j++){
                    node = node.next;
                    
                }
            
                newNode = new ListNode2(o, node, node.next);
                if(i != n){
                    node.next.prev = newNode;
                }
                node.next = newNode;
                n++;
            }

        }
    }

    public void remove(int i){
        if(!(i<0 || i>n)){
            
            if(i == 0){

                head = head.next;
                if(n != 1){
                    head.prev = null;
                }
                if(n == 1){
                    head = null;
                }
                n--;
            }
            else{
                ListNode2 node = head;
                for(int j =0; j<i-1; j++){
                    node = node.next;
                }
                
                if(i+1 != n){
                   node.next.next.prev = node.next.prev;
                }
                node.next = node.next.next;              
                n--;
            }
        }
    }

    /**
     * Prints out the elements in the list from the first to the last (front to back) and then from the last to the first
     * (back to front). This is useful to test whether the list nodes are connected correctly with next and prev references.
     */
    public void print() {
        // no elements to print for empty list
        if (head == null) {
            System.out.println("list empty.");
            return;
        }

        // follow next references to list elements from the front to the back of the list
        System.out.print("front to back: ");
        ListNode2 node = head;
        System.out.print(node.element + " ");
        while (node.next != null) {
            node = node.next;
            System.out.print(node.element + " ");
        }

        // follow prev references to list elements from the back to the front of the list
        System.out.print("-- and back to front: ");
        while (node != null) {
            System.out.print(node.element + " ");
            node = node.prev;
        }
        System.out.println();
    }
}
