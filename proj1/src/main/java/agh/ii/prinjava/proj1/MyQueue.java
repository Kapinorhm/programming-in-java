package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * MyQueue is an interface for creating and managing a queue data structure based on a double linked list.
 * @param <E>, Whatever the type of the element stored in the queue is, generic represents it.
 */
public interface MyQueue<E> {
    /**
     * A method for adding a new element to our queue.
     * @param x, the element that will be added to the queue
     */
    void enqueue(E x);

    /**
     * To remove the initial element, we use the queue method.
     * @return el, the element that was taken out of the queue
     */
    E dequeue();

    /**
     * the element that was taken out of the queue
     * @return a boolean value that is false if our queue is still full and true if it is empty.
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * A function to determine the number of elements in our queue.
     * @return el_number, the queue's total number of elements
     */

    int numOfElems();

    /**
     * A function that returns the value of the first item in the queue (the next element that will be removed)
     * @return myPeek, the highest value in the queue
     */
    E peek();

    /** Consider the advantages and disadvantages of including a factory method in the interface. */
    /**
     * A function for creating a data structure for a queue.
     * @param <T> the elements held in myQueue's type
     * @return MyQueueDLLBImpl, a new queue has been created
     */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}