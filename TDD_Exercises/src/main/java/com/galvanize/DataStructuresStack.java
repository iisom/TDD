package com.galvanize;

import java.util.EmptyStackException;


public class DataStructuresStack {


    private int length;

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public Node top;

//isEmpty() should return false after pushing an item onto the stack
//isEmpty() should return true after push then pop
    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        boolean b = isEmpty() == false;
    }
//pop() should throw an exception if the stack is empty
//pop() should return the top item on the stack if there is one
public int pop() {
    if (isEmpty()) {
        throw new EmptyStackException();
    }
    int data = top.data;
    top = top.next;
    boolean b = isEmpty() == true;
    return data;
}
//peek() should return null if there is no data on the stack
//peek() should return the current/top item on the stack if there is one
//peek() should return null after a push, then pop
//peek() should return first pushed obj after two pushes, then one pop
public String peek() {
    if (isEmpty()) {
        return null;
    } else {
        return String.valueOf(top.data);
    }
}

    public boolean contains(int data) {
        Node current = top;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
}


}