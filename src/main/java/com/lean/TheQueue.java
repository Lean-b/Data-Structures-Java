package com.lean;



import java.util.LinkedList;
import java.util.Queue;

/*
*   Queue: Una queue es una estructura de datos lineal que sigue el principio
*   FIFO (primero en entrar, primero en salir). Eso significa que el
*   objeto insertado primero será el primero en salir, seguido del objeto insertado a continuación.
*   Es una lista ordenada de objetos cuyo uso se limita.
 * */

public class TheQueue {
    public static void main(String[] args) {

        // Crea una instancia de Queue llamada "num" utilizando una LinkedList.
        Queue<Integer> num = new LinkedList<>() ;
        num.add(12);
        num.offer(52);

        System.out.println(num);

        // Verifica si la cola "num" está vacía e imprime el resultado (true o false).
        System.out.println(num.isEmpty());

        // Obtiene el tamaño de la cola "num" e imprime el resultado.
        System.out.println(num.size());

        // Elimina el elemento 12 de la cola "num" y devuelve true si se encontró y se eliminó correctamente.
        System.out.println(num.remove(12));

        System.out.println(num);

        System.out.println();

        // Crea una instancia de Queue de tipo String
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
