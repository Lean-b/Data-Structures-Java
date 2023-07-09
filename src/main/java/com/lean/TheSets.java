package com.lean;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TheSets {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("purple");
        colors.add("blue");
        colors.add("yellow");

        System.out.println(colors);


        System.out.println();

        Set<String> balls = new TreeSet<>();
        balls.add("blue");
        balls.add("red");
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }
}
