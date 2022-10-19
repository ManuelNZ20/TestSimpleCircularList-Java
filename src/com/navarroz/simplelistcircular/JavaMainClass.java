package com.navarroz.simplelistcircular;

public class JavaMainClass {

    public static void main(String[] args) {
        SimpleCircular circular1 = new SimpleCircular();
        circular1.addStart(1);
        circular1.addStart(11);
        circular1.addStart(12);
        circular1.addStart(14);
        circular1.addEnd(10);
        circular1.addEnd(-85);
        System.out.println("Simple circular\n"
                + circular1.list());
        circular1.removeStart();
        circular1.removeEnd();
        System.out.println("Simple circular\n"
                + circular1.list());
        SimpleCircular circular2 = new SimpleCircular();
        final int date = -5;//número a buscar dentro de la lista
        circular2.addStart(1);
        circular2.addStart(5);
        circular2.addStart(0);
        circular2.addStart(23);
        circular2.addStart(1);
        circular2.addStart(9);
        circular2.addStart(2);
        circular2.addStart(7);
        circular2.addStart(10);
        circular2.addStart(1);
        circular2.addStart(1);
        System.out.println("Simple circular2\n"+circular2.list());
        circular2.removeNode(1);
        System.out.println("New Simple circular2\n"+circular2.list());
        if (circular2.search(date)!=null) {//devuelve la primera ocurrencia encontrada en la lista
            System.out.println("El nodo con el dato "+date +" si existe en la lista");
        }else{
            System.out.println("El nodo con el dato "+date +" no existe en la lista");
        }
        
        SimpleCircular circular3 = new SimpleCircular();
        circular3.addNodeAsc(9);
        circular3.addNodeAsc(0);
        circular3.addNodeAsc(2);
        circular3.addNodeAsc(1);
        circular3.addNodeAsc(4);
        circular3.addNodeAsc(6);
        circular3.addNodeAsc(8);
        circular3.addNodeAsc(7);
        circular3.addNodeAsc(5);
        circular3.addNodeAsc(3);
        System.out.println("New list circular\n"
                + circular3.list());
    }
    
}
