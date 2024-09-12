package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;



import static org.junit.jupiter.api.Assertions.*;


public class DataStructuresStackTest {

    private DataStructuresStack dataStructuresStack = new DataStructuresStack();


    @BeforeEach
    public void setUp() {
        this.dataStructuresStack = new DataStructuresStack();
    }

    //Can create a stack
    @Test
    public void testCanCreateAStack() {
    assertNotNull(dataStructuresStack);
    }

    //Stack should be empty when first created
    @Test
    public void testIsEmpty() {
     assertTrue(dataStructuresStack.isEmpty());
    }

    //isEmpty() should return false after pushing an item onto the stack
    @Test
    public void testIsEmptyReturnFalseAfterPush() {
        dataStructuresStack.push(20);
        assertEquals(false, dataStructuresStack.isEmpty());
    }

    //isEmpty() should return true after push then pop
    @Test
    public void testIsEmptyReturnTrueAfterPush() {
        dataStructuresStack.push(20);
        dataStructuresStack.pop();
        assertEquals(true, dataStructuresStack.isEmpty());
    }

    //Pop throws an exception when its empty
    @Test
    public void testPopThrowsExceptionWhenEmpty() {
        assertTrue(dataStructuresStack.isEmpty());
        assertThrows(EmptyStackException.class, () -> dataStructuresStack.pop());
    }

    //Pop should return the top item on stack
    @Test
    public void testPopReturnsTopItemOnStack() {
        dataStructuresStack.push(20);
        assertEquals(20 ,dataStructuresStack.pop());
    }

    //  peek() should return null after a push, then pop
    @Test
    public void testPeekReturnsNull() {
        dataStructuresStack.push(20);
        dataStructuresStack.pop();
        assertEquals(null, dataStructuresStack.peek());
    }

//peek() should return first pushed obj after two pushes, then one pop
        @Test
        public void testPeekAfterTwoPushesAndPop() {
            dataStructuresStack.push(20);
            dataStructuresStack.push(30);
            dataStructuresStack.pop();
            assertEquals("20", dataStructuresStack.peek());
        }

//peek() should return null if there is no data on the stack
        @Test
        public void testPeekReturnNullIfEmpty() {
            dataStructuresStack.isEmpty();
            assertNull(null, dataStructuresStack.peek());
        }

//peek() should return the current/top item on the stack if there is one
        @Test
        public void testPeekReturnCurrentItem() {
        dataStructuresStack.push(10);
        assertEquals("10", dataStructuresStack.peek());
        }

//contains(obj) should return false if the object exists in the stack
        @Test
        public void testContainsReturnsFalseIfObjDoesntExist() {
        dataStructuresStack.push(10);
        dataStructuresStack.push(50);
        dataStructuresStack.push(30);
        assertFalse(dataStructuresStack.contains(20));
    }

    //contains(obj) should return true if the object exists in the stack
        @Test
        public void testContainsReturnsTrue() {
        dataStructuresStack.push(10);
        dataStructuresStack.push(50);
        dataStructuresStack.push(20);
        assertTrue(dataStructuresStack.contains(20));
    }
}
