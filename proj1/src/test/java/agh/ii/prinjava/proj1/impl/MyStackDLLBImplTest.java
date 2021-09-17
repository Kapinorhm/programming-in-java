package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**Test of class that adds element to stack
     */
    @Test
    void pop() {
        stackOfInts.push(43);
        assertEquals(43, stackOfInts.pop());
    }

    /**Test of class that removes element to stack
     */
    @Test
    void push() {
        stackOfInts.push(13);
        stackOfInts.peek();
    }

    /**Test of class that lists the number of the stack elements
     * */
    @Test
    void numOfElems() {
        stackOfInts.push(41);
        stackOfInts.push(25);
        stackOfInts.push(75);
        stackOfInts.push(23);

        assertEquals(4, stackOfInts.numOfElems());

    }

    /** Test of class that shows top element of stack
     */
    @Test
    void peek() {
        stackOfInts.push(34);
        stackOfInts.push(73);
        assertEquals(73, stackOfInts.peek());
    }
}