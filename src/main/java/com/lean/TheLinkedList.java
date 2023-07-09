package com.lean;

import java.util.LinkedList;

/*
* Linked-List: Es una lista enlazada que que representa a una lista doblemente enlazada de ida y vuelta.
* Mantiene el orden.
* Manipulacion rapida.
* Son estructuras de datos lineales, donde sus elementos no están almacenados en bloques continuos de memoria.
* Tamaño dinámico
* No tiene posiciones fijas
* */
public class TheLinkedList {
    public static void main(String[] args) {

        //La interfaz List define la funcionalidad básica común a todas las listas en Java
        //List<String> name = new LinkedList<>();

        // Crear una nueva LinkedList llamada "structures" que almacenará elementos de tipo String
        LinkedList<String> structures = new LinkedList<>();
        // Agregar elementos a la lista "structures" en posiciones específicas
        structures.add(0,"array");
        structures.add(1,"list");
        structures.add(2,"sets");
        structures.add(3,"maps");

        // Imprimir el tamaño de la lista "structures"
        System.out.println(structures.size());

        System.out.println(structures);

        // Eliminar el elemento en la posición 1 de la lista "structures" y mostrarlo
        System.out.println(structures.remove(1));

        System.out.println(structures);

        System.out.println();

        // Iterar sobre la lista "structures" e imprimir cada elemento
        for (String Structures : structures){
            System.out.println(Structures);
        }


        System.out.println();

        LinkedList<String> names = new LinkedList<>();
        names.add("Juan");
        names.add("Matias");
        names.add("Julieta");
        names.add("Leandro");

        System.out.println(names);

        System.out.println();

        // Agregar un elemento al principio y al final de la lista "names"
        names.addFirst("Agustin");
        names.addLast("Pedro");

        System.out.println(names);


        System.out.println();
        for (String Names : names){
            System.out.println(Names);
        }
    }
}
