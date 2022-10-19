package com.navarroz.simplelistcircular;

public class Node {
    private int date;
    private Node next;
    public Node(int date){
        this.date = date;
        this.next = this;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
