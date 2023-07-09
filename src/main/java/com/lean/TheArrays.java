package com.lean;

import java.util.Arrays;

public class TheArrays {
    public static void main (String[] args){

        System.out.println("String");

        System.out.println();

        //String[] colors ={"red","blue"};
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "orange";
        colors[3] = "red";
        colors[4] = "yellow";

        System.out.println(Arrays.toString(colors));

        System.out.println();

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        System.out.println();

        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println();

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println();

        for (int i = colors.length-1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println();

        Arrays.stream(colors).forEach(System.out::println);

        System.out.println();

        Arrays.stream(colors).forEach(color -> System.out.println(color));

        System.out.println();

        Arrays.stream(colors).filter(color -> color.startsWith("b")).forEach(System.out::println);

        System.out.println();

        Arrays.stream(colors).forEach(System.out::println);

        System.out.println();

        Arrays.stream(colors).parallel().forEach(System.out::println);
        //Arrays.stream(colors).parallel().forEach(System.out::println);

        System.out.println();

        for (int i = 0; i < Arrays.stream(colors).count() ; i++) {
            System.out.println(colors[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Number");

        System.out.println();

        int[] number = new int[5];
        number[0] = 0;
        number[1] = 1;
        number[2] = 2;
        number[3] = 3;
        number[4] = 4;

        Arrays.stream(number).forEach(System.out::println);


        System.out.println();


        int[] numbers = {1,2,3,4,5};

        Arrays.stream(numbers).forEach(System.out::println);

    }
}
