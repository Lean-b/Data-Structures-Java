package com.lean;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList: Es una clase java que implementa la interfaz de list.
 * Es un tipo de array pero dinámico.
 * El tamaño no es fijo como el array.
 * Se puede agregar y remover los elementos.
 */

public class TheArrayList {
    public static void main(String[] args) {

        // La interfaz List define la funcionalidad básica común a todas las listas en Java
        // List<String> colors = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();

        // Agrega elementos a la lista de colores
        colors.add("purple");
        colors.add("black");
        colors.add("blue");
        colors.add("yellow");

        System.out.println(colors);

        System.out.println();

        // Muestra la cantidad de elementos que tiene el ArrayList
        System.out.println(colors.size());

        // Verifica si el ArrayList contiene un elemento específico
        System.out.println(colors.contains("red"));    // False
        System.out.println(colors.contains("blue"));   // True

        System.out.println();

        // Cada elemento del ArrayList es un objeto, puede contener cualquier tipo de objeto
        List<Object> random = new ArrayList<>();
        random.add(1);
        random.add("Hello");

        System.out.println(random);

        System.out.println();

        // Itera sobre los elementos del ArrayList y los imprime utilizando una expresión lambda
        colors.forEach(System.out::println);

        System.out.println();

        // Itera sobre los elementos del ArrayList utilizando un bucle for-each
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println();

        // Itera sobre los elementos del ArrayList utilizando un bucle for tradicional
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        System.out.println();

        // Remueve un elemento específico del ArrayList
        colors.remove("blue");

        System.out.println(colors);

        System.out.println();


        // Utiliza el método findAny() de Stream para encontrar cualquier elemento del ArrayList
        System.out.println(colors.stream().findAny());

    }
}
