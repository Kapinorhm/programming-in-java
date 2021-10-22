package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 * MyStack is a user interface for creating and managing a stack data structure based on a double linked list.
 * @param <E>, Whatever the type of the element stored in the stack is, generic represents it.
 */

public interface MyStack<E> {
    /**
     * The pop method will remove the element from the top of the stack.
     * @return E, the value of the element that was removed
     */
    E pop();

    /**
     * The method push adds a new element to the stack's top.
     * @param x, the component to include in our stack
     */
    void push(E x);

    /**
     *The function that determines whether or not there are any more elements in our Stack.
     * @return a boolean value: false if our stack has any more elements, true if it is empty
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * A function that tells us how many elements are in the stack right now.
     * @return The number of elements in the stack, el number
     */

    int numOfElems();

    /**
     * A function for determining the value at the very top of a stack.
     * @return myPeek, the value at the top of the stack
     */
    E peek();

    /** Consider the advantages and disadvantages of including a factory method in the interface. */
    /**
     * Creates a stack data structure with a function.
     * @param <T>, the type of the piece in myStack that is stored
     * @return The new stack built is called MyStackDLLBImpl.
     */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
