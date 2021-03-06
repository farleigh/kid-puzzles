package ca.farleigh.kidpuzzles;

import java.util.Objects;

public class LinkedListFun {

    public <T> LinkedListNode<T> findMiddle(LinkedListNode<T> head) {
        throw new UnsupportedOperationException("Implement me");
    }

    public <T> LinkedListNode<T> reverse(LinkedListNode<T> head) {
        throw new UnsupportedOperationException("Implement me");
    }

    public static class LinkedListNode<T> {

        private final T value;
        private final LinkedListNode<T> next;

        public LinkedListNode(T value, LinkedListNode<T> next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return this.value;
        }

        public LinkedListNode<T> getNext() {
            return this.next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LinkedListNode<?> linkedListNode = (LinkedListNode<?>) o;
            return Objects.equals(value, linkedListNode.value) && Objects.equals(next, linkedListNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, next);
        }

        @Override
        public String toString() {
            return this.value.toString() + " " + this.next.toString();
        }
    }
}
