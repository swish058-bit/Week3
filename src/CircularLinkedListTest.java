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
}
