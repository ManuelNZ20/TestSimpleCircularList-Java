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

    public void addStart(int date) {
        Node newnode = new Node(date);
        if (isEmpty()) {
            start = end = newnode;
        } else {
            newnode.setNext(start);
            start = newnode;
            end.setNext(newnode);
        }
    }

    public void addEnd(int date) {
        Node newnode = new Node(date);
        if (isEmpty()) {
            start = end = newnode;
        } else {
            end.setNext(newnode);
            end = newnode;
            end.setNext(start);
        }
    }

    public void removeStart() {
        if (start == end) {
            start = end = null;
        } else {
            Node aux = start;
            start = start.getNext();
            end.setNext(start);
            aux.setNext(null);
        }
    }

    public void removeEnd() {
        if (start == end) {
            start = end = null;
        } else {
            Node p = null, aux;
            for (Node i = start; i != end;) {
                p = i;
                i = i.getNext();
            }
            aux = end;
            end = p;
            end.setNext(start);
            aux.setNext(null);
        }
    }

    public void removeNode(int date) {
        Node current = start, previous = null, aux = null;
        do {
            if (current.getDate() == date) {
                if (previous == null) {
                    if (start == end) {
                        start = end = null;
                        current = start;
                    } else {
                        aux = start;
                        start = start.getNext();
                        end.setNext(start);
                        aux.setNext(null);
                        current = start.getNext();
                    }
                } else {
                    if (current == end) {
                        aux = end;
                        end = previous;
                        end.setNext(start);
                        aux.setNext(null);
                        current = start;
                    } else {
                        aux = current;
                        current = current.getNext();
                        previous.setNext(current);
                        aux.setNext(null);
                    }
                }
            } else {
                previous = current;
                current = current.getNext();
            }
        } while (current != start);
    }

    public Node search(int date) {
        Node i = start;
        do {
            if (i.getDate() == date) {
                return i;
            }
            i = i.getNext();
        } while (i != start);
        return null;
    }

    public void addNodeAsc(int date)//agregaci??n ordenada de nodos de forma ascendete
    {
        Node newnode = new Node(date);
        if (isEmpty()) {
            start = end = newnode;
        } else if (start.getDate() > newnode.getDate()) {
            newnode.setNext(start);
            start = newnode;
            end.setNext(start);
        } else {
            Node current = start.getNext(), previous = null;
            boolean enc = false;
            do {
                if (current.getDate() >= newnode.getDate()) {
                    if (previous == null) {
                        newnode.setNext(current);
                        start.setNext(newnode);
                    } else {
                        previous.setNext(newnode);
                        newnode.setNext(current);
                    }
                    enc = true;
                } else {
                    previous = current;
                    current = current.getNext();
                }
            } while (current != start && !enc);

            if (!enc) {
                end.setNext(newnode);
                end = newnode;
                end.setNext(start);
            }
        }
    }

    public void addNodeDesc(int date) {//agregaci??n de nodos de formas descendente
        Node newnode = new Node(date);
        if (isEmpty()) {
            start = end = newnode;
        } else if (newnode.getDate() > start.getDate()) {
            newnode.setNext(start);
            start = newnode;
            end.setNext(start);
        } else {
            //   10 -> 9 -> 8 -> 5 -> 4 -> 2 -> 1 -> i
            Node current = start.getNext(), previous = null;
            boolean enc = false;
            do {
                if (newnode.getDate() >= current.getDate()) {
                    if (previous == null) {
                        start.setNext(newnode);
                        newnode.setNext(current);
                    } else {
                        previous.setNext(newnode);
                        newnode.setNext(current);
                    }
                    enc = true;
                } else {
                    previous = current;
                    current = current.getNext();
                }
            } while (current != start && !enc);

            if (!enc) {
                end.setNext(newnode);
                end = newnode;
                end.setNext(start);
            }
        }
    }

    public String list() {
        String list = "";
        Node n = start;
        do {
            list += (n.getNext() != start) ? n.getDate() + " -> " : n.getDate() + " -> ";
            n = n.getNext();
        } while (n != start);
        return list;
    }
}
