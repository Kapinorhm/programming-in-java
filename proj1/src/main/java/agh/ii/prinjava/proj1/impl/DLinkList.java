package agh.ii.prinjava.proj1.impl;

/**
 * This class's aim is to implement a double linked list.
 * @param <E>, stored elements in the double linked list (<E> type)
 */
public class DLinkList<E> {
    // ...
    /**
     * first node and last node of list.
     * Length points to the list's size.
     */
    private Node<E> firstNode = null;
    private Node<E> lastNode= null;
    private int DLL_length = 0;

    /**
     * This method's goal is to add a new node to the doubly linked list's beginning.
     * We build a new instance of the Node nested class
     * We verify the empty list case and modify the attributes
     * @param newVal, the element of specified type we want to add to the list
     */
    public void addFirst(E newVal){
        Node<E> newNode = new Node<>(newVal, null, null);
        if(firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            firstNode.prev = newNode;
            newNode.next = firstNode;
            firstNode = newNode;
        }
        DLL_length ++;
    }

    /**
     * This method's goal is to add a new node to the doubly linked list's end.
     * We build a new instance of the Node nested class
     * We verify the empty list case and modify the attributes
     * @param newVal, the element of specified type we want to add to the list
     */
    public void addLast(E newVal){
        Node<E> newNode =  new Node<>(newVal, null, null);
        if (lastNode == null){
            firstNode = newNode;
            lastNode = newNode;
        } else {
            newNode.prev = lastNode;
            lastNode.next = newNode;
            lastNode = newNode;
        }
        DLL_length ++;
    }

    /**
     * This method allows to remove the first list element.
     * It throws an exception when the list is empty.
     * If one node composes the list, first and last element become null.
     * If there are more elements in the list, we modify the references to the previous and next element to the list
     * @return data of the just removed node from list
     */
    public E removeFirst(){
        if (firstNode == null){
            throw new IllegalStateException("No element to remove! List is empty");

        } else if (DLL_length == 1){
            E rm_el = firstNode.elem;
            firstNode = null;
            lastNode = null;
            DLL_length--;
            return rm_el;
        }else {
            E rm_el = firstNode.elem;
            Node <E> temp = firstNode;
            Node<E> nextNode = firstNode.next;
            nextNode.prev = null;
            firstNode = nextNode;
            temp.next = null;


            DLL_length--;
            return rm_el;
        }
    }

    /**
     * The purpose of this method is to remove the last node of the list
     * if the list is empty, we cannot remove and throw exception
     * If one node composes the list, first and last element become null.
     * if there are more elements in the list, we modify the references to the previous and next element to the list
     * @return data of the just removed node from list
     */
    public E removeLast(){
        if ( lastNode == null){
            throw new IllegalStateException("No element to remove! List is empty");
        } if(DLL_length == 1){
            firstNode = null;
        }else {
            Node<E> previousNode = lastNode.prev;
            previousNode.next = null;
        }
        E rm_el = lastNode.elem;
        Node <E> temp = lastNode;
        temp.prev = null;

        DLL_length--;
        return rm_el;

    }
    /**
     * Method allowing to access and return value of list's first node
     * @return the value contained in the first node
     */
    public E peek(){
        return firstNode.elem;
    }

    /**
     * Method allowing to access and return value of list's last node
     * @return the value contained by the last node
     */
    public  E bottom(){
        return lastNode.elem;
    }

    /**
     * toString() method return the values of the attribute of each instance of double linked list
     * @return a string containing all the information we are interested in
     */
    @Override
    public String toString() {
        return "DLinkList{" +
                "firstNode=" + firstNode +
                ", lastNode=" + lastNode +
                ", DLL_length=" + DLL_length +
                '}';
    }

    /**
     * method returning the number of nodes
     * @return the size of the list
     */
    public int size() {
        if(firstNode == null){
            return 0;
        }

        int i = 0;

        while (firstNode != null){
            firstNode = firstNode.next;
            i++;
        }

        return i;

    }

    /**
     * We create a nested class Node that we use to build our linked list and its constructor to initialize its attributes
     * The first element stores a value of any type;
     * The second one is a reference to the previous node in the list;
     * The last element is a reference to the next node;
     * @param <T> Any sort of element can be stored in the node.
     */
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem, Node<T> next, Node<T> prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }
}
