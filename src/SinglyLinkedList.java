class SinglyLinkedList implements ILinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void addAtBeginning(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
    }

    public void print() {

        Node temp = head;
        while (temp != null) {
            System.out.print("  " + temp.data + "  ");
            temp = temp.next;
        }

    }
}