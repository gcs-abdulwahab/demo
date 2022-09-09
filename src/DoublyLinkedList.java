
class DoublyLinkedList implements ILinkedList {
    class Node extends ANode{
        
        Node previous;

        Node(int data) {
            super(data);
        }
    }

    Node head;

    public boolean isEmpty() {

        return head == null;
    }

    public void addAtBeginning(int val) {

    }

    public void print() {

    }

}