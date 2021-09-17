package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private final DLinkList<E> elems;

    /** Instanciates a Double linked list as a new Queue.
     * This method is a constructor of the MyQueueDLLBImpl class.
     */
    public MyQueueDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    /** This method allows to add a new node to final position of queue.
     * It uses the addLast method from DLinkList.java class.
     * @param x : Node to add to last position of queue.
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }

    /** This method allows to remove node in first position of queue.
     * It uses the removefirst method from DLinkList.java class.
     * @return the value of the removed node from list
     */
    @Override
    public E dequeue() {
        return elems.removeFirst();
    }

    /** Gets the value of a list's length and returns it.
     * @return integer corresponding to the list's size.
     */
    @Override
    public int numOfElems() {
        return elems.size();
    }

    /** Gets element in first position of queue.
     * @return the value of first node
     */
    @Override
    public E peek() {
        return elems.peek();
    }

}