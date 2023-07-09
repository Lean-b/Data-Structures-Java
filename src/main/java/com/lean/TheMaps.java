package com.lean;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 *   Maps:Es un mapeo de clave-valor.lo que significa que cada clave se
 *   asigna exactamente a un valor y que podemos usar
 *   la clave para recuperar el valor correspondiente de un mapa.
 *   Existen varias implementaciones de la interfaz Map, como HashMap y TreeMap.
 * */
public class TheMaps {
    public static void main(String[] args) {

        /*
         *   HashMap: Es una implementación de la interfaz Map.
         *   Utiliza una tabla hash interna para organizar y recuperar los elementos rápidamente.
         *   El acceso a los elementos en un HashMap se realiza a través de sus claves.
         *   No garantiza un orden específico de los elementos
         * */
        // Se crea un objeto HashMap llamado "skills" que almacena enteros como claves y cadenas de texto como valores.
        Map<Integer, String> skills = new HashMap<>();
        skills.put(1, "Java");
        skills.put(2, "Rust");
        skills.put(3, "Solidity");
        skills.put(4, "Go");

        System.out.println(skills);

        // Imprime el tamaño del mapa "skills".
        System.out.println(skills.size());

        // Imprime el valor asociado a la clave 1 en el mapa "skills".
        System.out.println(skills.get(1));

        // Verifica si el mapa "skills" contiene la clave 3 y devuelve true o false.
        System.out.println(skills.containsKey(3));
        System.out.println(skills.containsKey(5));

        // Imprime un conjunto de todas las claves del mapa "skills".
        System.out.println(skills.keySet());

        // Imprime una colección de todos los valores del mapa "skills".
        System.out.println(skills.values());

        // Imprime un conjunto de todos los pares clave-valor del mapa "skills".
        System.out.println(skills.entrySet());


        System.out.println();

        // Imprime cada clave y valor del mapa "skills" en formato "clave :: valor".
        skills.forEach((key, value) -> System.out.println(key + " :: " + value));

        System.out.println();

        // Imprime cada par clave-valor del mapa "skills" en formato "clave :: valor".
        skills.entrySet().forEach(x -> System.out.println(x.getKey() + " :: " + x.getValue()));


        /*
         *   TreeMap:  También es una implementación de la interfaz Map, pero a diferencia de HashMap,
         *   los elementos se almacenan en un árbol de búsqueda balanceado en lugar de una tabla hash.
         *   Esto significa que los elementos en un TreeMap se mantienen ordenados según el valor de las claves.
         *   La ordenación se basa en el orden natural de las claves o en un comparador personalizado.
         * */
        Map<Integer, String> blockchains = new TreeMap<>();
        skills.put(1, "Polkadot");
        skills.put(2, "Ethereum");
        skills.put(3, "Bitcoin");


    }
}
