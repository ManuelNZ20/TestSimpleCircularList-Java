package com.navarroz.simplelistcircular;

public class SimpleCircular {

    private Node start;
    private Node end;

    public SimpleCircular() {
        start = end = null;
    }

    public boolean isEmpty() {
        return start == null;
    }
    
    public void addStart(int date){
        Node newnode = new Node(date);
        if (isEmpty()) {
            start = end = newnode;
        }else{
            newnode.setNext(start);
            start = newnode;
            end.setNext(newnode);
        }
    }
    
    public void addEnd(int date){
        Node newnode = new Node(date);
        if (isEmpty()) {
            start = end = newnode;
        }else{
            end.setNext(newnode);
            end = newnode;
            end.setNext(start);
        }
    }
    public String list() {
        String list = "";
        Node n = start;
        do {
            list += (n.getNext() != start) ? n.getDate() + " -> " : n.getDate() +" -> ";
            n = n.getNext();
        } while (n != start);
        return list;
    }
}
