class Main {
    Node head;


    static class Node {
        Node prev;
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
        Node last = null;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;

            while (last != null) {
                System.out.print(last.data + " ");
                last = last.prev;
            }
        }
    }



    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.setNext(head);
        new_node.prev = null;
        if (head != null)
            head.prev = new_node;

        head = new_node;
    }
        // head = new_node;

      /*  if(head == null) {

            head = new_node;
            tail = new_node;
            new_node.next = head;
        }
        else {
            tail.next = new_node;
            tail = new_node;
            tail.next = head;
        } */




    void remove(int source)
    {
        Node temporary = head, prev = null;

        if (temporary != null && temporary.data == source) {
            head = temporary.next;
            return;
        }
        while (temporary != null && temporary.data != source) {
            prev = temporary;
            temporary = temporary.next;
        }

        if (temporary == null)
            return;
        prev.next = temporary.next;
    }

    void removeposition(int position) {
        if (head == null)
        return;

        Node temp = head;
        if (position == 0) {
            head = temp.next;
        }

        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;


        if (temp == null || temp.next == null)
            return;


        Node next = temp.next.next;

        temp.next = next;
    }
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }











    public static void main(String[] args) {

        Main linkfromnintendo = new Main();

        linkfromnintendo.head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);


        linkfromnintendo.head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);

        linkfromnintendo.push(0);
        linkfromnintendo.push(22);
        linkfromnintendo.remove(1);
        linkfromnintendo.removeposition(0);
        linkfromnintendo.printList();
        linkfromnintendo.reverse(linkfromnintendo.head);
        linkfromnintendo.printList();
    }


}


