package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.w3c.dom.Node;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private final DLinkList<E> elems;

    /** Instanciates a Double linked list as a new Stack.
     * This method is a constructor of the MyStackDLLBImpl class.
     */
    public MyStackDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    /** This method allows to remove node in top position of stack.
     * It uses the removeLast method from DLinkList.java class.
     * @return the value of the removed node from list
     */
    @Override
    public E pop() {
        return elems.removeLast();
    }

    /** This method allows to add a new node to top position of the stack.
     * It uses the addLast method from DLinkList.java class.
     * @param x : Node to add to first position of stack.
     */
    @Override
    public void push(E x) {
        elems.addLast(x);
    }

    /** Gets the value of a list's length and returns it.
     * @return integer corresponding to the list's size.
     */
    @Override
    public int numOfElems() {
        return elems.size();
    }

    /** Gets element in top position of Stack.
     * @return the value of element on top position
     */
    @Override
    public E peek() {
        return elems.bottom();
    }
}
