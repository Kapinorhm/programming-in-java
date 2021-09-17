package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * The purpose of this class is to run unit test on the MyQueueDLLBImpl to verify if our methods works perfectly
 */
class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**Test of class that adds element to queue
     */
    @Test
    void enqueue() {
        queueOfInts.enqueue(43);
        queueOfInts.enqueue(62);
        assertEquals(43, queueOfInts.dequeue());
    }

    /**Test of class that removes element to queue
     */
    @Test
    void dequeue() {
        queueOfInts.enqueue(76);
        assertEquals(76, queueOfInts.dequeue());

    }
    /**Test of class that lists the number of the queue elements
     * */
    @Test
    void numOfElems() {
        queueOfInts.enqueue(65);
        queueOfInts.enqueue(23);
        queueOfInts.enqueue(76);
        queueOfInts.enqueue(46);

        assertEquals(4, queueOfInts.numOfElems());

    }

    /** Test of class that shows head element of queue
     */
    @Test
    void peek() {
        queueOfInts.enqueue(42);
        queueOfInts.enqueue(64);
        queueOfInts.enqueue(35);

        assertEquals(42, queueOfInts.peek());
    }
}