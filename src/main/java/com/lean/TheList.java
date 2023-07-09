package com.lean;

import java.util.ArrayList;
import java.util.List;

public class TheList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();

        colors.add("purple");
        colors.add("black");
        colors.add("blue");
        colors.add("yellow");

        System.out.println(colors);

        System.out.println();

        System.out.println(colors.size());
        System.out.println(colors.contains("red"));
        System.out.println(colors.contains("blue"));


        System.out.println();

        List<Object> random = new ArrayList<>();
        random.add(1);
        random.add("Hello");

        System.out.println(random);

        System.out.println();

        colors.forEach(System.out::println);

        System.out.println();

        for (String color:
             colors) {
            System.out.println(color);
        }

        System.out.println();

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors);
        }

        System.out.println();

        colors.remove("blue");

        System.out.println(colors);

        System.out.println();

        System.out.println(colors.stream().findAny());

    }
}
