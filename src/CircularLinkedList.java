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

    public String showList() {
        StringBuilder sb = new StringBuilder();
        DLNode curr = dummy.next;

        while (curr != dummy) {
            sb.append(curr.value).append(" ");
            curr = curr.next;
        }

        return sb.toString().trim();
    }

    public String showReverseList() {
        StringBuilder sb = new StringBuilder();
        showReverseHelper(dummy.prev, sb);
        return sb.toString().trim();
    }

    private void showReverseHelper(DLNode node, StringBuilder sb) {
        if (node == dummy) return;
        sb.append(node.value).append(" ");
        showReverseHelper(node.prev, sb);
    }

    public boolean find(int value) {
        DLNode curr = dummy.next;

        while (curr != dummy) {
            if (curr.value == value) return true;
            curr = curr.next;
        }

        return false;
    }

    public boolean remove(int value) {
        DLNode curr = dummy.next;

        while (curr != dummy) {
            if (curr.value == value) {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                return true;
            }
            curr = curr.next;
        }

        return false;
    }
}