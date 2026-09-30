import org.junit.Test;
import static org.junit.Assert.*;

public class CircularLinkedListTest {
    @Test
    public void testAddAndShowList() {
        CircularLinkedList list = new CircularLinkedList();
        list.addItem(2);
        list.addItem(4);
        list.addItem(1);

        assertEquals("2 4 1", list.showList());
    }
    @Test
    public void testShowReverseList() {
        CircularLinkedList list = new CircularLinkedList();
        list.addItem(2);
        list.addItem(4);
        list.addItem(1);

        assertEquals("1 4 2", list.showReverseList());
    }
    @Test
    public void testFindExists() {
        CircularLinkedList list = new CircularLinkedList();
        list.addItem(10);
        list.addItem(20);

        assertTrue(list.find(20));
    }
    @Test
    public void testFindNotExists() {
        CircularLinkedList list = new CircularLinkedList();
        list.addItem(10);

        assertFalse(list.find(99));
    }
    @Test
    public void testRemoveMiddle() {
        CircularLinkedList list = new CircularLinkedList();
        list.addItem(2);
        list.addItem(4);
        list.addItem(1);

        assertTrue(list.remove(4));
        assertEquals("2 1", list.showList());
    }
    @Test
    public void testRemoveFirst() {
        CircularLinkedList list = new CircularLinkedList();
        list.addItem(2);
        list.addItem(4);

        assertTrue(list.remove(2));
        assertEquals("4", list.showList());
    }
    @Test
    public void testRemoveLast() {
        CircularLinkedList list = new CircularLinkedList();
        list.addItem(2);
        list.addItem(4);

        assertTrue(list.remove(4));
        assertEquals("2", list.showList());
    }
    @Test
    public void testRemoveNotFound() {
        CircularLinkedList list = new CircularLinkedList();
        list.addItem(2);

        assertFalse(list.remove(99));
        assertEquals("2", list.showList());
    }
    @Test
    public void testEmptyListBehavior() {
        CircularLinkedList list = new CircularLinkedList();

        assertEquals("", list.showList());
        assertEquals("", list.showReverseList());
        assertFalse(list.find(10));
        assertFalse(list.remove(10));
    }
    @Test
    public void testLongSequence() {
        CircularLinkedList list = new CircularLinkedList();

        for (int i = 1; i <= 10; i++) {
            list.addItem(i);
        }

        assertTrue(list.find(7));
        assertTrue(list.remove(7));
        assertFalse(list.find(7));
        assertEquals("1 2 3 4 5 6 8 9 10", list.showList());
    }

}
