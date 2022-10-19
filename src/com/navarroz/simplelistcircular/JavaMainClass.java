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
    }
    
}
