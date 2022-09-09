public class App {
    public static void main(String[] args) {

        ILinkedList sl;
        ILinkedList dl;

        sl = new SinglyLinkedList();
        dl = new DoublyLinkedList();
        dl.isEmpty();
        sl.addAtBeginning(2);
        sl.addAtBeginning(1);
        sl.addAtBeginning(0);

        sl.print();
    }
}

