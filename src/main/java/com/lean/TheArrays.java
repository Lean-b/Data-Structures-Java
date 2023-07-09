package com.lean;

import java.util.Arrays;

/*
* Array: Es una estructura de datos que almacena distintas variables de forma ordenada.
* Nos permite almacenar una gran cantidad de datos de un mismo tipo.
* No cambia en tiempo de ejecucion.
* El array empieza desde el elemento 0.
* Si queremos almacenar 10 elemento debemos contar desde el 0 por lo tanto son 9.
* array :: [0][1][2][3][4][5][6][7][8][9] = 10 elementos
* */

public class TheArrays {
    public static void main(String[] args) {

        System.out.println("String");

        System.out.println();

        // Crea un array
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
        // Itera sobre el array colors y asigna cada elemento a la variable "color"
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println();
        // Itera sobre el array colors en orden inverso utilizando un bucle for
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println();

        // Convierte el array colors en un flujo de elementos y los imprime en la consola utilizando una referencia de método
        Arrays.stream(colors).forEach(System.out::println);

        System.out.println();

        // Convierte el array colors en un flujo de elementos y los imprime en la consola utilizando una expresión lambda.
        Arrays.stream(colors).forEach(color -> System.out.println(color));

        System.out.println();

        // Convierte el array colors en un flujo de elementos y los imprime en la consola utilizando una expresión lambda.
        // Y filtra los elementos que comienzan con "b".
        Arrays.stream(colors).filter(color -> color.startsWith("b")).forEach(System.out::println);

        System.out.println();

        // Imprime el contenido del array colors en paralelo utilizando un flujo de elementos(lo hace de forma desordenada).
        Arrays.stream(colors).parallel().forEach(System.out::println);
        //Arrays.stream(colors).parallel().forEach(System.out::println);

        System.out.println();

        // Itera sobre el flujo de elementos del array colors utilizando un bucle for y el método count() para determinar la cantidad de elementos
        for (int i = 0; i < Arrays.stream(colors).count(); i++) {
            System.out.println(colors[i]);
        }

        System.out.println();

        System.out.println("Number");

        System.out.println();

        // Crea un array de tipo int con capacidad para 5 elementos
        int[] number = new int[5];
        number[0] = 0;
        number[1] = 1;
        number[2] = 2;
        number[3] = 3;
        number[4] = 4;

        Arrays.stream(number).forEach(System.out::println);


        System.out.println();

        // Otra forma de crear  un array
        int[] numbers = {1, 2, 3, 4, 5};

        Arrays.stream(numbers).forEach(System.out::println);

    }
}
