class Main {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            setNext(null);
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    public void printList(){
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.getNext();
        }
    }



    public void push(int new_data) {
       // String answer;
        Node new_node = new Node(new_data);
        new_node.setNext(head);
        head = new_node;


    }

    public void remove(int source) {
    Node temporary = head;
        Node prev = null;

    if(temporary != null && temporary.data == temporary) {
        head = temporary.getNext();
        return;
    }
    while (temporary != null && temporary.data != source)
    {
    prev = temporary;
    temporary = temporary.getNext();
    }
    if(temporary == null){
        return;
    }
    prev.setNext(temporary.getNext());
    }



    public static void main(String[] args) {

        Main linkfromnintendo = new Main();

        linkfromnintendo.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        /* The four nodes have been created */

        linkfromnintendo.head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);

        linkfromnintendo.push(420);
        linkfromnintendo.push(22);

        linkfromnintendo.printList();

    }
}