package com.lean;

import java.util.LinkedList;
import java.util.Queue;


public class TheQueue {
    public static void main(String[] args) {
        Queue<Integer> num = new LinkedList<>();
        num.add(12);
        num.offer(52);

        System.out.println(num);

        System.out.println(num.isEmpty());
        System.out.println(num.size());
        System.out.println(num.remove(12));
        System.out.println(num);

        System.out.println();

        Queue<String> name = new LinkedList<>();
        name.add("Lean");
        name.add("Julieta");
        name.add("Juan");

        System.out.println(name);

        //Queue<Contact>  person = new LinkedList<>();
        //person.add(new Contact("John", "Doe"));
        //person.add(new Contact("Jane", "Smith"));

    }

}
