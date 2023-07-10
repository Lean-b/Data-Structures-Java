package com.lean;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
*   Set: Son estructura de datos para almacenar un solo valor.
*   La interfaz Set es implementada por varias clases en Java, como HashSet, TreeSet y LinkedHashSet,
*   cada una con sus propias características y compromisos de rendimiento.
*
*
* */
public class TheSets {
    public static void main(String[] args) {
        /*
        *   HashSet: Esta implementación utiliza una tabla hash para almacenar los elementos del conjunto.
        *   No mantiene ningún orden específico de los elemento
        * */
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("purple");
        colors.add("blue");
        colors.add("yellow");
        // (Duplicate Set element)
        colors.add("yellow");
        System.out.println(colors);


        System.out.println();
        /*
        *   TreeSet: Esta implementación utiliza una estructura de árbol (árbol binario balanceado)
        *   para almacenar los elementos del conjunto.
        *   Los elementos se ordenan de acuerdo con su orden natural
        *   o mediante un comparador personalizado si se especifica.
        *   Por lo tanto, los elementos se almacenan en orden ascendente.
        * */
        Set<String> balls = new TreeSet<>();
        balls.add("blue");
        balls.add("red");
        balls.forEach(System.out::println);



        /*
        *   LikedHashSet: Esta implementación es similar a HashSet, pero además de utilizar una tabla hash,
        *   también mantiene un orden de inserción
        *   de los elementos utilizando una lista enlazada. Esto significa que conserva el orden en
        *   que se agregaron los elementos al conjunto.
        * */
        Set<Integer> number = new LinkedHashSet<>();
        number.add(1);
        number.add(2);
        number.add(10);
        number.add(11);
        number.add(12);
        number.forEach(System.out::println);

    }
}
