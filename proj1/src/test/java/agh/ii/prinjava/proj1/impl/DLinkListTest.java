package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test to verify the function "addFirst"
     * 1: Use the addFirst to create element
     * 2: To check if the element was appropriately added to the list, use "removeFirst" and assertEquals.
     * When we add the element, we also check if the function "get" gives an error.
     * */
    @Test
    void addFirstTest() {
        dLinkList.addFirst(67);
        assertEquals(67, dLinkList.peek());
    }

    /**
     * Test to verify the function "addLast"
     * 1: Use the addLast to create element
     * 2: To check if the element was appropriately added to the list, use "removeFirst" and assertEquals.
     * */
    @Test
    void addLast() {
        dLinkList.addLast(12);
        assertEquals(12, dLinkList.bottom());
    }
    /**
     * Test to verify the function "removeLast"
     * 1: Use the addLast to create element
     * 2: To check if the element was appropriately added to the list, use "removeLast" and assertEquals.
     * */
    @Test
    void removeLast() {
        dLinkList.addFirst(65);
        dLinkList.addFirst(12);
        assertEquals(65, dLinkList.removeLast());
    }

    /**
     * Test to verify the function "removeFirst"
     * 1: Use the addLast to create element
     * 2: To check if the element was appropriately added to the list, use "removeFirst" and assertEquals.
     * */
    @Test
    void removeFirst() {
        dLinkList.addFirst(54);
        dLinkList.addFirst(24);
        dLinkList.addFirst(7);
        assertEquals(7, dLinkList.removeFirst());
    }
}