public class CircularLinkedList {
    private DLNode dummy;

    public CircularLinkedList() {
        dummy = new DLNode(0);
        dummy.next = dummy;
        dummy.prev = dummy;
    }

    public void addItem(int value) {
        DLNode newNode = new DLNode(value);

        DLNode last = dummy.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = dummy;
        dummy.prev = newNode;
    }