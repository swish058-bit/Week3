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
}
