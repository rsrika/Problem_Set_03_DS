import static org.junit.Assert.*;
import org.junit.Test;

public class ProblemSet03Test {

    // LinkedList with the min at the start
    @Test
    public void testGetMin1() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        assertEquals("Failed for a 3-element LL where the minimum is at the start.", 1, ProblemSet03.getMin(head).data);
    }

    // LinkedList with the min at the end
    @Test
    public void testGetMin2() {
        Node head = new Node(6);
        head.next = new Node(5);
        head.next.next = new Node(4);
        head.next.next.next = new Node(3);
        head.next.next.next = new Node(2);
        assertEquals("Failed for a 5-element LL where the minimum is at the end.", 2, ProblemSet03.getMin(head).data);
    }

    @Test
    public void testMergeTwoLists1(){
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = new Node(7);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);

        Node headOfMergedList = ProblemSet03.mergeTwoLists(head1, head2);
        Node currentInMerged = headOfMergedList;
        for (int i = 1; i < 9; i++){
            if (currentInMerged == null || currentInMerged.data != i)
                fail("Did not correctly merge two linked lists.");
            currentInMerged = currentInMerged.next;
        }
    }

    @Test
    public void testReverseList(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node[] list = {head, head.next, head.next.next};
        Node headOfReversed = ProblemSet03.reverseList(head);
        Node currentInReversed = headOfReversed;
        for (int i = list.length - 1; i >= 0; i--){
            if (currentInReversed == null || currentInReversed.data != list[i].data)
                fail("Did not correctly reverse a linked list.");
            currentInReversed = currentInReversed.next;
        }
        assertNull(currentInReversed);
    }

    @Test
    public void isPalindrome1(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        assertFalse("Failed to correctly identify a non-palindrome list.", ProblemSet03.isPalindrome(head));
    }

    @Test
    public void isPalindrome2(){
        Node head = new Node(7);
        head.next = new Node(8);
        head.next.next = new Node(7);
        assertTrue("Failed to correctly identify a palindrome list.", ProblemSet03.isPalindrome(head));
    }
}
