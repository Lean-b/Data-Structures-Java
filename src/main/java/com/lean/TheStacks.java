package com.lean;

import java.util.Stack;

/*
 *   Stack: Es un tipo de estructura de datos lineal que sigue el principio de LIFO(Last in first out)
 *   El ultimo en entrar es el primero que sale.
 *
 *
 *
 *  */
public class TheStacks {
    public static void main(String[] args) {
        // Crea una instancia de la clase Stack que contendrá elementos de tipo Integer y se llama num.
        Stack<Integer> num = new Stack<>();

        // Agrega varios elementos a la pila num utilizando el método add().
        num.add(1);
        num.add(12);
        num.add(14);
        num.add(13);
        num.add(5);

        System.out.println(num);


        System.out.println();

        // Agrega varios elementos a la pila num utilizando el método push().
        num.push(1);
        num.push(14);
        num.push(4);
        num.push(2);


        System.out.println(num);

        // Imprime el tamaño actual de la pila num.
        System.out.println(num.size());

        // Imprime el elemento superior de la pila num sin eliminarlo, utilizando el método peek().
        System.out.println(num.peek());

        // Imprime y elimina el elemento superior de la pila num, utilizando el método pop().
        System.out.println(num.pop());

        // Imprime el nuevo tamaño de la pila num después de eliminar el elemento superior.
        System.out.println(num.size());

        // Verifica si la pila num está vacía utilizando el método empty() y lo imprime.
        System.out.println(num.empty());


        System.out.println(num);


        System.out.println();

        // Remueve el elemento en la posición 1 de la pila num y lo imprime.
        System.out.println(num.remove(1));

        // Imprime el nuevo tamaño de la pila num después de remover el elemento.
        System.out.println(num.size());


        System.out.println();

        // Limpia la pila num, eliminando todos los elementos.
        num.clear();


        System.out.println(num);

        // Imprime el nuevo tamaño de la pila num después de limpiarla.
        System.out.println(num.size());

        // Verifica si la pila num está vacía después de limpiarla y lo imprime.
        System.out.println(num.empty());
    }
}
