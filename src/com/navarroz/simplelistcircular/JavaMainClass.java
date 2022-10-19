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
    }
    
}
