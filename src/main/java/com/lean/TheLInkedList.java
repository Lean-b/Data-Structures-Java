package com.lean;

import java.util.LinkedList;

public class TheLInkedList {
    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<>();
        name.add(0,"Le");
        name.add(1,"Lean");
        name.add(2,"Leand");
        name.add(3,"Leandro");

        System.out.println(name.size());
        System.out.println(name);
        System.out.println(name.remove(1));
        System.out.println(name);


        System.out.println();

        LinkedList<String> names = new LinkedList<>();
        names.add("Le");
        names.add("Lean");
        names.add("Leand");
        names.add("Leandro");
        names.addLast("Lean");
        names.addFirst("Leandro");
        System.out.println(names);
    }
}
