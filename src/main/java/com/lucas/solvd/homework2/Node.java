package com.lucas.solvd.homework2;

public class Node<T> {
    public T value;
    public Node<T> next;
    public double id;
    public Object pointer;

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.id = (Math.random() * 50000);
    }

    public Node() {
    }

    ;
}