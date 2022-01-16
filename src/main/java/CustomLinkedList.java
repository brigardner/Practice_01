import java.util.Iterator;

public class CustomLinkedList<E> implements CustomListInterface<E>, Iterable<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    //Adds an object to the end of the linked list
    public void add(E e) {
        Node<E> newNode = new Node<E>(e);
        if (head == null) {
            head = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void add(E e, int index) {
        if (index >= this.size) {
            System.out.println("Index out of bounds");
        }

        Node<E> newNode = new Node<E>(e);


    }

    //Gets the object found at provided index position
    public E get(int index) {
        if (index >= this.size) {
            System.out.println("Index out of bounds");
            return head.obj;
        }

        Node<E> tmpNode = this.head;

        for (int i = 0; i < index; i++) {
            tmpNode = tmpNode.next;
        }

        return tmpNode.obj;
    }

    public void clear() {

    }

    public int contains(E e) {
        Node<E> tmpNode = this.head;

        for (int i = 0; i < this.size; i++) {
            if (tmpNode.obj == e) {
                return i;
            }
            tmpNode = tmpNode.next;
        }

        return -1;
    }

    public void remove(int index) {

    }

    public int size() {
        return this.size;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> cursor = head;

            public boolean hasNext() {
                if (cursor == null) {
                    return false;
                }
                return true;
            }

            public E next() {
                E e = cursor.obj;
                cursor = cursor.next;
                return e;
            }
        };
    }

    private class Node<E> {
        Node<E> next;
        Node<E> prev;
        E obj;

        //Empty constructor creates an empty node
        Node() {

        }

        //Creates a node and stores an object by reference
        Node(E e) {
            obj = e;
        }

        //Creates a node which stores an object by reference and has a reference to another node
        Node(E e, Node<E> next) {
            this(e);
            this.next = next;
        }

        //Creates a node which stores an object by reference and has references to two nodes
        //The previous and next in the list
        Node(E e, Node<E> next, Node<E> prev) {
            this(e, next);
            this.prev = prev;
        }
    }
}
