package ca.farleigh.kidpuzzles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListFunTest {

    @Test
    public void testFindMiddleSimpleOdd() {
        final LinkedListFun fun = new LinkedListFun();
        final LinkedListFun.LinkedListNode<Integer> head = buildLinkedList(new Integer[] { 1, 3, 5 });
        assertEquals(Integer.valueOf(3), fun.findMiddle(head).getValue());
    }

    @Test
    public void testFindMiddleSimpleEven() {
        // Round down when even
        final LinkedListFun fun = new LinkedListFun();
        final LinkedListFun.LinkedListNode<Integer> head = buildLinkedList(new Integer[] { 1, 3, 5, 4 });
        assertEquals(Integer.valueOf(3), fun.findMiddle(head).getValue());
    }

    @Test
    public void testFindMiddleMoreComplexOdd() {
        final LinkedListFun fun = new LinkedListFun();
        final LinkedListFun.LinkedListNode<Integer> head = buildLinkedList(new Integer[] { 1, 3, 5, 4, 7, 2, 1, 6, 5 });
        assertEquals(Integer.valueOf(7), fun.findMiddle(head).getValue());
    }

    @Test
    public void testReverseSimple() {
        final LinkedListFun fun = new LinkedListFun();
        final LinkedListFun.LinkedListNode<Integer> head = buildLinkedList(new Integer[] { 1, 3, 5 });
        assertEquals(buildLinkedList(new Integer[] { 5, 3, 1 }), fun.reverse(head));
    }

    @Test
    public void testReverseMoreComplex() {
        final LinkedListFun fun = new LinkedListFun();
        final LinkedListFun.LinkedListNode<Integer> head = buildLinkedList(new Integer[] { 1, 3, 5, 4, 7, 2, 1, 6, 5 });
        assertEquals(buildLinkedList(new Integer[] { 5, 6, 1, 2, 7, 4, 5, 3, 1 }), fun.reverse(head));
    }

    private static <T> LinkedListFun.LinkedListNode<T> buildLinkedList(T[] values) {
        LinkedListFun.LinkedListNode<T> curr = null;
        for (int i = values.length - 1; i >= 0; i -= 1) {
            curr = new LinkedListFun.LinkedListNode<>(values[i], curr);
        }
        return curr;
    }
}
